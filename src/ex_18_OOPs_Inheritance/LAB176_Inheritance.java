package ex_18_OOPs_Inheritance;

public class LAB176_Inheritance {
    public static void main(String[] args) {
 Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();


        son s1 = new son();
        s1.bhk3();
        System.out.println(f1.gold_f);
        s1.bhk2();
    }

}
class Father {
    int gold_f = 1000; //Attribute / Data Variable / Property / Instance Variables

    void bhk2() { //Behaviour / Method / Functions / Data Members
        System.out.println("Father - 2BHK");

    }
}

class son extends Father{
    void bhk3(){
        System.out.println("3BHK Son");

    }
}
