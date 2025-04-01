package practice_daily;

import javax.swing.*;
import java.util.Scanner;



public class P10_Tasks { //palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input , I will check palindrome");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if (newString.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static String reverseString(String userInput) {
        String reversed = "";
        for (int i = userInput.length()-1; i>=0 ; i--) {
            reversed = reversed + userInput.charAt(i);

        }
        return reversed;


    }
}
