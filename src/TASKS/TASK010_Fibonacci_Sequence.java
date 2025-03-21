package TASKS;



public class TASK010_Fibonacci_Sequence {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b=1;
        System.out.println("Fibonacci Sequence:  ");

        if (n > 0){
            System.out.println(a + " ");
        }
        if ( n > 1){
            System.out.println(b + " ");
        }
        for (int i = 2; i < n ; i++) {
            int next = a +b;
            System.out.println(next + " ");
            a=b;
            b = next;

            System.out.println();
        }




}
}
