package TASKS;

import java.util.Scanner;

public class  TASK009_Triangle_Class_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side lengths");
        int l1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int l3 = scanner.nextInt();

        if  (l1==l2 && l2==l3){
            System.out.println("The Triangle is Acute Triangle");
            System.out.println("Thank You for the input");
        }
        else if (l1==l2 && l1!=l3) {
            System.out.println("The Triangle is Isosceles Triangle");
            System.out.println("Thank You for the input");
        }
        else
        {
            System.out.println("The Triangle is Scalene Triangle");
            System.out.println("Thank You for the input");
        }


    }
    }

