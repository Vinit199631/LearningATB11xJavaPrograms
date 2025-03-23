package TASKS;

import java.util.Scanner;

public class TASK016_LeapYr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:  ");
        int year = scanner.nextInt();



            if ((year %4==0 && year %100!=0) || (year % 400==0)){
                System.out.println("The Year is Leap Year");
            }
            else {
                System.out.println("Not a leap year");
            }

        }


    }

