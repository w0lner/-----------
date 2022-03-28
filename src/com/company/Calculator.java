package com.company;


  public  class Calculator {

    public static int Calculate(String str1, int[] i1) {

       char sum = '+';
       char sub = '-';
       char mul = '*';
       char div = '/';
        int ind1 = str1.indexOf(sum);
        if (ind1 == -1)
        {
            int ind2 = str1.indexOf(sub);
            if (ind2 == -1)
            {
                int ind3 = str1.indexOf(mul);
                if (ind3 == -1)
                {
                    int ind4 = str1.indexOf(div);
                    if (ind4 == -1)
                    {
                        System.out.println("Можно вводить только арабские или только латинские цифры от 1 до 10!");
                    }
                    double d1 = (double) i1[0]/i1[1];
                    int i2 = (int) Math.round(d1);
                    return i2;
                }
                return i1[0]*i1[1];
            }
            return i1[0]-i1[1];
        }
        return i1[0]+i1[1];
    }
}
