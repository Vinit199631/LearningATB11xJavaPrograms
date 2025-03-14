package ex_07_Increment_Decrement_Op;

public class Lab071_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

//The post-increment operator increases the value of a after its value has been used in the expression.
//So, in this case, the current value of a (which is 10) is used first, and then a is incremented by 1.
//So, a++ evaluates to 10, and then a becomes 11.
    }
}
