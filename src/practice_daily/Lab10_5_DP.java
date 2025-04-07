package practice_daily;

import java.util.Scanner;

public class Lab10_5_DP {
public static void printTable(int n ){  // declaration function
    for (int i = 1; i <= 10 ; i++) {
        System.out.println(n + "X" + i + "=" + (n*i));

    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        printTable(number); // Calling method
    }
}
