package org.example;

public class hvjv {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("Число меньше 5");

        }
        else {
            System.out.println("Число больше или равно 5");
            String s = "mas";
            String t = "Mas";
            System.out.println(s.equals(t));
        }
        //напишите тут ваш код

    }
}
