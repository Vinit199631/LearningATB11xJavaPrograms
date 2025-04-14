package ex_29_Exceptions;

public class Lab214_String_NullPointer {

    public static void main(String[] args) {
        String name= null;
        name.trim(); // java.lang.NullPointerException
    }
}
