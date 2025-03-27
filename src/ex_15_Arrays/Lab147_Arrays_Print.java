package ex_15_Arrays;

import java.util.Arrays;

public class Lab147_Arrays_Print {
    public static void main(String[] args) {
        int [] marks = {91,90,51,100,91,92,89};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);  // given so many functions- will comeback in collection framework
        System.out.println("------------");
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
        
        

    }
}
