package com.company;
/*
Прием String массива, проверка массива на несоответствие требованиям:
1) только арабские или только латинские цифры
2) только целые числа
3) только от 1 до 10

Создание int массива
вывод: int[]
 */


public class TestArray {
    public static boolean isRome = false;
    public static boolean isArab = false;
    public static String[] rome  = new String[] {"I","II","III","IV" ,"V" , "VI" , "VII" ,"VIII" , "IX" , "X" ,"XI" , "XII" , "XIII" , "XIV" , "XV" , "XVI" , "XVII" , "XVIII" , "XIX" , "XX" , "XXI" , "XXII" , "XXIII" , "XXIV" , "XXV" , "XXVI" , "XXVII" , "XXVIII" , "XXIX" , "XXX" , "XXXI" , "XXXII" , "XXXIII" , "XXXIV" , "XXXV" , "XXXVI" , "XXXVII" , "XXXVIII" , "XXXIX" , "XL" , "XLI" , "XLII" , "XLIII" , "XLIV" , "XLV" , "XLVI" , "XLVII" , "XLVIII" , "XLIX" , "L" , "LI" , "LII" , "LIII" , "LIV" , "LV" , "LVI" , "LVII" , "LVIII" , "LIX" , "LX" , "LXI" , "LXII" , "LXIII" , "LXIV" , "LXV" , "LXVI" , "LXVII" , "LXVIII" , "LXIX" , "LXX" , "LXXI" , "LXXII" , "LXXIII" , "LXXIV" , "LXXV" , "LXXVI" , "LXXVII" , "LXXVIII" , "LXXIX" , "LXXX" , "LXXXI" , "LXXXII" , "LXXXIII" , "LXXXIV" , "LXXXV" , "LXXXVI" , "XXXVII" , "LXXXVIII" , "LXXXIX" , "XC" , "XCI" , "XCII" , "XCIII" , "XCIV" , "XCV" , "XCVI" , "XCVII" , "XCVIII" , "XCIX" , "C"};
    public static String[] arab  = new String[] {"1","2","3","4","5","6","7","8","9","10"};

    public static int[] testToАccordance(String[] str1)
    {
        int[] i2 = new int[str1.length];
        int[] numbers  = new int[] {1,2,3,4,5,6,7,8,9,10};
        String error = "Несоответствие требованиям!";


        for (int i1 = 0; i1 < str1.length;i1++)
        {
            for (int i3 = 0; i3 < arab.length; i3++)
            {
                if (str1[i1].equals(rome[i3]))
                {
                    i2[i1] = numbers[i3];
                    isRome = true;
                    break;
                }
                if (str1[i1].equals(arab[i3]))
                {
                    i2[i1] = numbers[i3];
                    isArab = true;
                    break;
                }
                if (i3 == arab.length - 1)
                {
                    System.out.println("Вводить можно только целые числа от 1 до 10!");
                    System.exit(0);
                }
            }
        }
        if (isArab && isRome)
        {
            System.out.println("Вводить можно только арабские или латинские цифры одновременно!");
            System.exit(0);
        }
        return i2;
    }
}
