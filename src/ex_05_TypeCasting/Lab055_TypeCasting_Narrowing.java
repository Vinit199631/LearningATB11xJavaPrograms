package ex_05_TypeCasting;

public class Lab055_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 200;
        //byte b = val; //Invalid in case of narrowing -> Implicit casting is not allow in narrrowing
        byte b2 =(byte)val; //Valid - Narrowing - Explicit Casting - Allowed
        // But data loss
        System.out.println(b2);

    }
}
