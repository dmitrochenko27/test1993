package org.example;

public class mkkj {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if ( 50 < a && a < 100){
            //напишите тут ваш код
            System.out.println("Число " + a + " содержится в интервале.");
        }
        else{
            System.out.println("Число " + a + " не содержится в интервале.");

        }
    }
}
