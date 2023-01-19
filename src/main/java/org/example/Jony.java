package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jony {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void aaa() {
        int count = 0;
        int a = 3;
        while (a > 0)
            try {
                if (Integer.parseInt(reader.readLine()) > 0) {
                    count++;
                }
                a--;
            } catch (Exception e) {
            }
        System.out.println(count);

    }
}


