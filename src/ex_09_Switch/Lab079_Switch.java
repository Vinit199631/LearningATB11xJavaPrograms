package ex_09_Switch;

import java.util.Scanner;

public class Lab079_Switch {
    public static void main(String[] args) {
        //Switch
        // Take user input  and tell them the day which they have told
        // 1 to 7 -> 1-> Mon , 5-> Fri
        //8? - Not Allowed or error

        //int day = Integer.parseInt(args [0]); // CLI Option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid , day number");
                break;
        }



    }
}
