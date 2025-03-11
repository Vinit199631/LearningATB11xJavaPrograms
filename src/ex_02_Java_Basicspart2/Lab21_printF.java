package ex_02_Java_Basicspart2;

public class Lab21_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Your variable is %d",a);
//        %d - int,byte,long,short,- data type
//        %s - String
//        %f - float , double
//        %b     - boolean

        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d",a,b);
    }
}
