package org.example;

import java.util.Scanner;

public class dcdc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; true; )
        {
            String s = scanner.nextLine();
            if (s.equals("exit"))
                break;
        }
    }
}
