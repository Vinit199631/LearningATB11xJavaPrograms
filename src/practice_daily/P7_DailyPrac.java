package practice_daily;



import java.util.Scanner;

public class P7_DailyPrac {
    public static void main(String[] args) {
        //Switch

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character");
        char ch = scanner.next().charAt(0);


        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Its a vowel.");
                break;
            default:
                if (ch >='a' && ch <='z'){
                    System.out.println("Its a consonant.");
                }else {
                    System.out.println("Invalid input. Please enter a valid alphabet letter.");
                }
                break;

        }
        scanner.close();






    }
}
















