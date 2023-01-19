package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class kedlcj {
    public static void main(String[] args) throws Exception {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
//        int a = Integer.parseInt(reader.readLine());
//        int d = Integer.parseInt(reader.readLine());
        if (a < d) {
            System.out.println(a);
        }
            else if (a > d){
                System.out.println(d);
            }
            else {
                System.out.println(d);
            }

        }
        //напишите тут ваш код

    }

