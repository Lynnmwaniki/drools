package com.spring.drools.service;

import com.spring.drools.model.RiskScore;
import com.spring.drools.model.Transaction;
import com.spring.drools.util.NameValidator;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {
    @Autowired
    private KieContainer kieContainer;

    public RiskScore processTransaction(Transaction transaction) {
        RiskScore riskScore = new RiskScore();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("riskScore", riskScore);

        // Validate name variations
        String referenceName = "John Doe"; // Example reference name
        boolean similarNames = NameValidator.isSimilarName(transaction.getCardholderName(), referenceName);
        transaction.setSimilarNames(similarNames);

        kieSession.insert(transaction);
        kieSession.fireAllRules();
        kieSession.dispose();
        return riskScore;
    }
}
