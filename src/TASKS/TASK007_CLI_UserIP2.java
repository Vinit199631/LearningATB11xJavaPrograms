package TASKS;

import java.util.Scanner;

public class TASK007_CLI_UserIP2 {
    // Take a user input 2 numbers from the arguments
    // and calculate the maximum in between with ternary operator.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name");
        String name = scanner.nextLine();

        System.out.println("Enter Your Age");
        int age = scanner.nextInt();

        System.out.println("Enter Your Salary");
        double Salary = scanner.nextDouble();

        System.out.println("\n----user Information-----");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ Salary);

        scanner.close();




      //  int num1 = Integer.parseInt(args[0]);
        //int num2 = Integer.parseInt(args[1]);
        //System.out.println(Math.max(num1,num2));
        //String result = num1 > num2?"num1 is max" : "num2 is max" ;
        //System.out.print(result);
    }

}
