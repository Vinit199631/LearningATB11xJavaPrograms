package ex_24_OOPs_Abstraction_Interface;

public class Lab194_I {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.drive();
    }
}

class Car1 implements Engine1 , Brakes{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }


    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void test() {
        Engine1.super.test();
    }

    @Override
    public void applyBreak() {

    }
}

interface Brakes{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("concrete complete");
    }
}
