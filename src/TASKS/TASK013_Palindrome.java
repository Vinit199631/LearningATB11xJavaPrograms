package TASKS;

import java.util.Scanner;

public class TASK013_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input , I will check palindrome");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if (newString.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
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
