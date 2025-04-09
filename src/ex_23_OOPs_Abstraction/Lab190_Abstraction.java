package ex_23_OOPs_Abstraction;

public class Lab190_Abstraction {
    // Showing only essential details to the user hiding the implementation - Hwo to hide?
    // by using Abstract , Interface
    //
    public static void main(String[] args) {

        Child c = new Child();
        c.loan50K();
        c.loan25k();
        // Father f1 = new Father():
        Father f2 = new Child();

    }


}

abstract class Father{

    abstract void loan50K();

    void loan25k(){
        System.out.println("Given 25K");
    }

}

class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("Child will pay the loan!");
    }
}
