package ex_06_Ternary_Operator;

public class Lab060_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20"): "B" ;
        System.out.println(result);
    }
}
