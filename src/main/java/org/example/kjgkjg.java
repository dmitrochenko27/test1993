package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class kjgkjg {

/*
Положительное и отрицательное число
*/

    //public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0) {
            System.out.println(a*2);

            //напишите тут ваш код

        }
        else if (a < 0) {
            a = a +1 ;
            System.out.println( a);
        }
        System.out.println(a);
    }
}
