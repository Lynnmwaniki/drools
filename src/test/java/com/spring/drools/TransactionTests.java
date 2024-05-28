package com.spring.drools;

import com.spring.drools.config.DroolsConfig;
import com.spring.drools.model.RiskScore;
import com.spring.drools.model.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TransactionTests {

    @Autowired
    private DroolsConfig droolsConfig;

    private KieSession kieSession;

    @BeforeEach
    public void setup() {
        Resource dt
                = ResourceFactory
                .newClassPathResource("com/spring/drools/rules/Transaction.xlsx",
                        getClass());
        kieSession = new DroolsConfig().getKieSession(dt);
    }

    @Test
    public void testTransactionFromKnownAddress(){
        Transaction transaction = new Transaction();
        transaction.setBillingAddress("123 Main avenue");

        kieSession.insert(transaction);
        kieSession.fireAllRules();

        assertFalse(transaction.isFlagged());
        assertEquals(0, transaction.getRiskScore());
    }

    @Test
    public void testTransactionFromUnknownAddress() {
        Transaction transaction = new Transaction();
        transaction.setBillingAddress("456 Unknown Street");

        kieSession.insert(transaction);
        kieSession.fireAllRules();

        assertTrue(transaction.isFlagged());
        assertEquals(100, transaction.getRiskScore());
    }

    @Test
    public void testTransactionFromNonHighRiskCountry() {
        Transaction transaction = new Transaction();
        transaction.setCountry("USA");

        kieSession.insert(transaction);
        kieSession.fireAllRules();

        assertFalse(transaction.isFlagged());
        assertEquals(0, transaction.getRiskScore());
    }

    @Test
    public void testTransactionFromHighRiskCountry() {
        Transaction transaction = new Transaction();
        transaction.setCountry("Iran");

        kieSession.insert(transaction);
        kieSession.fireAllRules();

        assertTrue(transaction.isFlagged());
        assertEquals(150, transaction.getRiskScore());
    }

    @Test
    public void testHighRiskIndividualTransaction() {
        Transaction transaction = new Transaction();
        transaction.setCardholderName("John Doe");
        transaction.setAmount(1500);
        transaction.setIndividualRisk("HIGH");

        kieSession.insert(transaction);
        kieSession.fireAllRules();

        assertTrue(transaction.isFlagged());
        assertEquals(200, transaction.getRiskScore());
    }

    @Test
    public void testFrequentTransactionFromSameMerchant(){
        Transaction transaction = new Transaction();
        transaction.setCardholderName("Jane Hallo");
        transaction.setAmount(1000);
        transaction.setMerchantName("High-Risk Merchant");
        transaction.setMerchantFrequency(6);

        kieSession.insert(transaction);
        kieSession.fireAllRules();

        assertTrue(transaction.isFlagged());
        assertEquals(150, transaction.getRiskScore());
    }
    @Test
     public void testVerifyCardHolderName(){
        Transaction transaction = new Transaction();
        transaction.setCardholderName("John Doe");
        transaction.setAmount(1000);

        RiskScore riskScore = DroolsConfig.processTransaction(transaction);

        assertTrue(transaction.isFlagged());
        assertEquals(100, transaction.getRiskScore());
    }


}
