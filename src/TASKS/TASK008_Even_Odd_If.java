package TASKS;

import java.util.Scanner;

public class TASK008_Even_Odd_If {
    //Take user input & Check weather the input is even or odd number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int Num = scanner.nextInt();
        System.out.println(Num);

        if(Num%2==0)
        {
            System.out.println("The number is Even.");
        }
        else {
            System.out.println("The number is odds.");
        }
    }
}
