package ex_06_Ternary_Operator;

public class Lab059_TO_P1 {
    public static void main(String[] args) {
        //result = condition ? expression 1 ;: expression 2;
        int number = 5;
        String result = number>0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
