package ex_15_Arrays;

public class Lab151_Sum_of_Arrays {
    public static void main(String[] args) {

        int[] number = {12,34,10};
        int sum = 0;

        for (int i = 0; i <number.length ; i++) {
            sum = sum +  number[i];
        }
        System.out.println(sum);
    }
}
