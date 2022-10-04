package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {1, 3, 5, 2, 4, 0};
        int[] b = {9, 12, 56, 354, 0, -7, -2};
        System.out.println(commonElement(a, b));
    }

    static boolean commonElement(int[] a, int[] b)
    {
        boolean FLAG = false;
        for (int i : a)
            for (int j : b)
                if (i == j)
                {
                    FLAG = true;
                    break;
                }
        return FLAG;
    }
}
