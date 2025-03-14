package ex_08_If_Condition;

import java.util.Scanner;

public class Lab077_if_Else {
    public static void main(String[] args) {
        //int age = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 18) {
            System.out.println("Allowed to Vote");
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}
