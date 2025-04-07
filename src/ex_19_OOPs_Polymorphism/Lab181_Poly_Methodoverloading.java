package ex_19_OOPs_Polymorphism;

public class Lab181_Poly_Methodoverloading {
    public static void main(String[] args) {
        MathOperation m1 = new MathOperation();
        int r1 = m1.add(3,4);
        int r2 = m1.add(3,4,5);
        double r3 = m1.add(3.14,5.46);
    }
}
class  MathOperation{
    //in the same class when you have a method wit same
    // name but diff args and diff return type.

    // eg
    int add (int a,int b){
        return a+b;
    }
    int add (int a, int b , int c){
        return a+b+c;
    }
    double add (double a , double b){
        return a+b;
    }
}