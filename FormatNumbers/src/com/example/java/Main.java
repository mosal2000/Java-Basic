package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        Locale locale = new Locale("da", "DK");

        NumberFormat numF_da = NumberFormat.getNumberInstance(locale);
        System.out.println("Number format in Danish: " + numF_da.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat curF_da = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency in Danish: " + curF_da.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }

}
