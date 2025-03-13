package ex_05_TypeCasting;

public class Lab055_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        byte a = b; //Valid-> Implicit Casting - Automatically
        int a1 = (int)b;  // Explicit Casting - Does not require in widening
        System.out.println(a1);
    }
}
