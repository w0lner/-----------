package com.company;
/*
Запуск сканнера , сканирование консоли , создание String текста из консоли
 */

import java.util.Scanner;

public class Scan {
   public static String console()
    {
        Scanner cs = new Scanner(System.in);
        String str1 = cs.nextLine();
        return str1;

    }
}
