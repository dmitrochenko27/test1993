package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class lnkj {

/*
Строка - описание
*/


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
//        System.out.println(a);
//        System.out.println(a % 2);
//        if (a % 2 == 0 && a < 0) {
//            System.out.println("отрицательное четное число");
//
//        }

        if (a < 0 && ((a % 2) != 0))
            System.out.println("отрицательное нечетное число");


//        if (a == 0)
//            System.out.println("ноль");

        if ((a % 2) == 1 && a > 0)
            System.out.println("положительное нечетное число");

        if ((a % 2) == 0 && a > 0)
            System.out.println("положительное четное число");
        else
            System.out.println(a/(-2));

    }
}
