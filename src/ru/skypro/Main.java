package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here



        int salary = 65535;
        int total = 0;
        int i = 0;

        while ( total < 1_000_000 ) {
            total = total + total / 100;
            total = total + salary;
            if ( i % 5 == 0) {
                System.out.println(" Month " + i + " in total " + total);

            }

            System.out.println(total);
        }










    }
}
