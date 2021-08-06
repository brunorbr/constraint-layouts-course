package com.striptrips.utils;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatterUtil {

    public static final String PORUGUESE = "pt";
    public static final String BRAZIL = "br";

    public static String formatCurrencyToBrl(BigDecimal packagePriceValue) {
        NumberFormat brazillianFormat = DecimalFormat.getCurrencyInstance(
                new Locale(PORUGUESE, BRAZIL)
        );
        return brazillianFormat
                .format(packagePriceValue);
    }
}
