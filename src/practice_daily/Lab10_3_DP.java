package practice_daily;

import java.util.Scanner;

public class Lab10_3_DP {
    // Prime Number
    public static boolean isPrimeNumber(int n) {

        if (n<=1){
            System.out.println("Invalid Number");
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {  // If n is divisible by i, it's not prime
                return false;
            }
        }
            return true;

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (isPrimeNumber(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();  // Always close the scanner
    }
}












