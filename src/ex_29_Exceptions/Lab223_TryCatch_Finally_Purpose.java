package ex_29_Exceptions;
import java.util.Scanner;

public class Lab223_TryCatch_Finally_Purpose {


    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int b= 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("end of program , sc closed!");
        }

    }
    }
