package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loki {

        public void ggg() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String num = reader.readLine();
            int f = Integer.parseInt(reader.readLine());
            int i = 0;
            while ( f > i){
                System.out.println(num);
                i++;
            }
        }
        //напишите тут ваш код

    }




//    public Loki() throws IOException {
//    }
//
//    public void ggg() {
//
//    }
//
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    int n = Integer.parseInt(reader.readLine());
       // System.out.println(n);


