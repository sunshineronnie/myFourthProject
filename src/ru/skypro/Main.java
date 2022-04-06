package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here







        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i ++;
        }




        for (int t = 10; t > 0; t--){
            System.out.println(t);
        }



       for (int dayNumber = 1; dayNumber <= 31; dayNumber ++)
           if (dayNumber % 7 == 0) {
               System.out.println( "Today is friday " + dayNumber + " you should submit your report");
           }

       for (int year = 1896; year < 2100; year = year + 79) {
           System.out.println(year);
       }
















    }
}
