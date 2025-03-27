package ex_15_Arrays;

import java.util.Arrays;

public class Lab152_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34

//
        int _2nd_max = numbers [0];
        for (int i = 0; i <numbers.length-2 ; i++) {
            if (numbers[i]>_2nd_max){
                _2nd_max = numbers[i];
            }
            System.out.println(_2nd_max);

        }
        return;


    }
}
