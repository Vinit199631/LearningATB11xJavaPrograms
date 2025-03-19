package ex_09_Switch;

import java.sql.SQLOutput;

public class Lab091_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
            case 'C':
                System.out.println("68");
                break;
        }
    }
}
