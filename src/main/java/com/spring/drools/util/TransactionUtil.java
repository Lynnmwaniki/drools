package com.spring.drools.util;

import com.spring.drools.model.Transaction;

import java.util.List;

public class TransactionUtil {
    public static boolean exceedsCardholderAverage(double currentAmount, List<Transaction> pastTransactions) {
        double totalAmount = pastTransactions.stream().mapToDouble(Transaction::getAmount).sum();
        double averageAmount = totalAmount / pastTransactions.size();
        return currentAmount > averageAmount;
    }
}
