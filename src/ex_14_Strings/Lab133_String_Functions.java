package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab133_String_Functions {
    public static void main(String[] args) {
        char c ='A'; // Not a string
        System.out.println(c);


        String s1 = "ABCD";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
    }
}
