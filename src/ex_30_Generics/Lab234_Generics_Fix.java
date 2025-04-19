package ex_30_Generics;

public class Lab234_Generics_Fix {

    public static void main(String[] args) {

        temp_sum(3,4);
        temp_sum(3.34,4.45);
        temp_sum("Pramod","Dutta");


    }

    static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
