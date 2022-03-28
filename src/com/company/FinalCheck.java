package com.company;
/*
Проверка на соответствие требованиеям:
1) латинские только только положительн
2) арабское число только отрицательное

Конвертация латинского запроса на латинский ответ
 */

public class FinalCheck
{
    public static String check(int i1)
    {
        String result = null;
        if (TestArray.isRome && i1 < 1)
        {
            System.out.println("Вводя латинские цифры ответ может быть только положительным!");
            System.exit(0);
        }
        if (TestArray.isArab && i1 > 0)
        {
            System.out.println("Вводя арабские цифры ответ может быть отрицательным или 0!");
            System.exit(0);
        }
        if (TestArray.isRome)
        {
            result = TestArray.rome[i1-1];
        }
        if (TestArray.isArab)
        {
            result = Integer.toString(i1);
        }
        return result;
    }
}

