package ex_06_Ternary_Operator;

public class Lab063_TO_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        //Logic Building Formula
        //step 1- find input/output(Ask output to your interviewer)
        // I/P - n1,n2,n3 - int
        //O/P - String - max number

        //Step 2 - Rough Logic , Think about it
        //n1>n2 and n1>n3 -> n1
        //n2>n3 and n2>n1 -> n2
        //n3

        //nested ternary

        int max = (n1>n2)? (n1>n3)? n1:n3:((n2>n3)? n2:n3);
        System.out.println("Max is" + max);
    }
}
