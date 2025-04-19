package ex_29_Exceptions;

public class Lab218_Try_Catch_Multiple_IQ {

    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println("ARE YOU FOOL");
        }
        // Not possible as Big Exception is used before
//        catch (ArithmeticException e){
//            System.out.println("ARE YOU FOOL");
//        }
        System.out.println("2");




    }
}
