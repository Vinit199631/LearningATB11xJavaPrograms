package practice_daily;

import java.util.Scanner;

public class P8_DailyPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();


int mult = 0;
        for (int i = 1; i <=10 ; i++) {

            mult *= i;

            System.out.println(n + "X" + i + "=" + (n*i));

        }
    }
}
