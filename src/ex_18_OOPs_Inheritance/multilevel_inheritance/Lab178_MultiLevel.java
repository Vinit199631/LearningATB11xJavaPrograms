package ex_18_OOPs_Inheritance.multilevel_inheritance;

public class Lab178_MultiLevel {
    public static void main(String[] args) {


        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

        GrandFather gf = new GrandFather();
        gf.gf();

        Father f1 = new Father();
        f1.gf();
        f1.f();

        System.out.println("----");

        Son s = new Son();
        s1.gf();
        s1.f();
        s1.s();

        GrandFather g1 = new Son();  // Dynamic Dispatch
        GrandFather g2 = new Father();
        Father f2 = new Son();
    }
}
