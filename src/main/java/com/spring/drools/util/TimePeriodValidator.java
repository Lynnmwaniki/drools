package com.spring.drools.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;
public class TimePeriodValidator {
    public static boolean isWithinShortPeriod(Date timestamp1, Date timestamp2, long thresholdMinutes) {
        long diffInMillies = Math.abs(timestamp2.getTime() - timestamp1.getTime());
        long diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff <= thresholdMinutes;
    }
}
