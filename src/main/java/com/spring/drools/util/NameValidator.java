package com.spring.drools.util;

public class NameValidator {
    public static boolean isSimilarName(String name1, String name2) {
        //Create a LevenshteinDistance object to calculate the distance between two strings
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

        //Calculate the distance between the two names
        int distance = levenshteinDistance.apply(name1, name2);


        //Define a similarity threshold as one-third the length of the longer name
        int threshold = Math.max(name1.length(), name2.length()) / 3;
        return distance <= threshold;
    }
}
