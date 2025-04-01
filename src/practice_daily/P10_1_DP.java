package practice_daily;

// Make a function to multiply 2 numbers & return the product


import java.util.Scanner;

public class P10_1_DP {
    public static int calculateProduct(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculateProduct(a,b));
    }

}
