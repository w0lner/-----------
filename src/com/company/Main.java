package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = Scan.console(); //Записываем с консоли
        String[] arraystr1 = FormattingForAnArray.split(str1);//создаем из записанного с консоли строковый массив
        int[] i1 = TestArray.testToАccordance(arraystr1);//конвертируем строковый массив в числовой
        int i2 = Calculator.Calculate(str1,i1);//считаем
        String result = FinalCheck.check(i2);//проверяем ответ

        System.out.println(result);

    }
}
