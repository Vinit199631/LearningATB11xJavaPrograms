package ex_15_Arrays;

import java.util.Scanner;

public class Lab149_Arrays_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size = sc.nextInt();

        int [] numbers_marks = new int[size];
        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println("Enter the numbers");
            numbers_marks[i] = sc.nextInt();
            
        }
        System.out.println("--------");
        for (int i = 0; i < numbers_marks.length ; i++) {
            System.out.println(numbers_marks[i]);
            
        }
        sc.close();

    }

}
