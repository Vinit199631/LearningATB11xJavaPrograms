package TASKS;

public class TASK007_CLI_UserIP2 {
    // Take a user input 2 numbers from the arguments
    // and calculate the maximum in between with ternary operator.
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println(Math.max(num1,num2));
        String result = num1 > num2?"num1 is max" : "num2 is max" ;
        System.out.print(result);
    }

}
