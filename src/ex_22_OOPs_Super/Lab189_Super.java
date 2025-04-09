package ex_22_OOPs_Super;

public class Lab189_Super {
}
class God{
    void Sound(){
        System.out.println("God!");
    }
}
class Animal extends God{
    protected String color = "White";
    void sound(){
        System.out.println("Animal Sound");
        super.Sound();
    }
}
class Dog extends Animal{
    private String color = "Black";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}
