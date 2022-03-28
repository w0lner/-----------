package com.company;

public class FormattingForAnArray {
    public static String[] split (String str1) {
        String[] str2 = str1.replaceAll("\\s+", "").split("[\\+\\-\\*\\/\\=]");
        if(str2.length != 2)
        {
            System.out.println("Операция может проводиться только с 2 числами! (а+б)");
            System.exit(0);
        }
        return str2;
    }
}
