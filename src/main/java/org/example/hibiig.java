package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class hibiig {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //    int c;
        int count = 0;
        int count1 = 0;
        int a = 3;
//        Scanner ch = new Scanner(System.in);
//        for (int i = 0; i < 4; i++) {
//          //  Scanner ch = new Scanner(System.in);
//           int c = ch.nextInt();
//            if ( c > 0) {
//                count++;
//            }
//             if ( c < 0){
//                count1++;
//            }
//        }
        while (a > 0) {
            if (Integer.parseInt(reader.readLine()) > 0) {
                count++;
            }
            count1 = 3 - count;
            if (Integer.parseInt(reader.readLine()) < 0) {
                count1++;
            }
            if (Integer.parseInt(reader.readLine()) == 0) {
                count1--;
                count--;

                a--;

            }
            System.out.println("количество положительных чисел:" + count);
            System.out.println("количество отрицательных чисел: " + count1);

        }


/*
Положительные и отрицательные числа
*/

    }
}
