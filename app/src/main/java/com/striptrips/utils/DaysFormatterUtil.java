package com.striptrips.utils;

public class DaysFormatterUtil {

    public static final String MULTIPLE = " dias";
    public static final String SINGLE = " dia";

    public static String formatToText(int daysAmount) {
        if (daysAmount > 1) {
            return daysAmount + MULTIPLE;
        }
        return daysAmount + SINGLE;
    }
}
