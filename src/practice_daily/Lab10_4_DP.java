package practice_daily;

import java.util.Scanner;

public class Lab10_4_DP {
    // Function to check if a given number n is even or not
    public static boolean isEven(int n){
        if (n<=0){
            System.out.println("Invalid Number");
            return false;

        }
        return n % 2 == 0;
        }



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

    if (isEven(n)){
        System.out.println(n + " is a Even number.");

} else {
        System.out.println(n + " is a odd number.");
    }

    }










}
