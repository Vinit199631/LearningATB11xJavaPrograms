package ex_07_Increment_Decrement_Op;

public class Lab069_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = (a++);
        System.out.println(a);
        System.out.println(result);
        //Line No | a | Exp
        // 5 | 11 | NA
        // 6 | 12 | 11
        // 7 | 12 | NA
        // 8 | NA | 12
    }
}
