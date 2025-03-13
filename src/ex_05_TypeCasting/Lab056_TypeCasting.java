package ex_05_TypeCasting;

public class Lab056_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876787656l;
        //short s = phone_no;//Not possible Impicit Narrowing
        //still you want to do then follow below
        short s = (short) phone_no; //Explicit Narrowing //data loss
        System.out.println();
    }
}
