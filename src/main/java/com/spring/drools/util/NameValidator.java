//package com.spring.drools.util;
//
//public class NameValidator {
//    public static boolean isSimilarName(String name1, String name2) {
//        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
//        int distance = levenshteinDistance.apply(name1, name2);
//        int threshold = Math.max(name1.length(), name2.length()) / 3;
//        return distance <= threshold;
//    }
//}
