package practice_daily;


import java.util.Scanner;

public class P9_DailyPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int number;
        do {
            System.out.println("Enter a number");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Error: The number must be positive. Please try again.");
            }

        }

            while (number < 0);

        System.out.println("You entered a valid number: " + number);


        }

            }







