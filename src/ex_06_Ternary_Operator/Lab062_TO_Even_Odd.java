package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab062_TO_Even_Odd {
    public static void main(String[] args) {


        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }

}
