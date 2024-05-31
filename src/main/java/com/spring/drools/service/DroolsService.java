package com.spring.drools.service;

import com.spring.drools.model.RiskScore;
import com.spring.drools.model.Transaction;
import com.spring.drools.util.NameValidator;
import com.spring.drools.util.TimePeriodValidator;
import com.spring.drools.util.TransactionUtil;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroolsService {
    @Autowired
    private static KieContainer kieContainer;

    public static RiskScore processTransaction(Transaction transaction, List<Transaction> pastTransactions) {
        RiskScore riskScore = new RiskScore();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("riskScore", riskScore);

        // Validate name variations
        String referenceName = "John Doe"; // Example reference name
        boolean similarNames = NameValidator.isSimilarName(transaction.getCardholderName(), referenceName);
        transaction.setSimilarNames(similarNames);

        //Validate time period
        boolean withinShortPeriod = false;
        long thresholdMinutes = 30;
        for (Transaction previousTransaction : previousTransactions) {
            if (TimePeriodValidator.isWithinShortPeriod(previousTransaction.getTimestamp(), transaction.getTimestamp(), thresholdMinutes)){
                withinShortPeriod = true;
                break;
            }
        }

        //Check if transaction exceeds the cardHolder's average amount
        boolean exceedsAverage = TransactionUtil.exceedsCardholderAverage(transaction.getAmount(), pastTransactions);
        transaction.setExceedsCardholderAverage(exceedsAverage);

        kieSession.insert(transaction);
        kieSession.fireAllRules();
        kieSession.dispose();
        return riskScore;
    }
}
