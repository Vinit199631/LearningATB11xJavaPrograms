package ex_22_OOPs_Super;

public class Lab188_SuperKeyword {
    public static void main(String[] args) {

   Car c1 = new Car(100);
   c1.display();

    }
}
class Vehicle {
    public int maxSpeed = 180;
    Vehicle(){
        System.out.println("Default Const");
    }
    Vehicle (int a){
        System.out.println("Param Con");
    }
    //Method Overloading - Same , Same name function with diff arguments
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }



}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
super(); //DC
    }

    Car(int a){
        super(10); //PC of Parent

    }
    //Method Overloading

    @Override
    void display(){

        System.out.println(this.maxSpeed); // this means current class object
        System.out.println(super.maxSpeed); // Super means parent
        super.message();
        super.message(10);
        super.display();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}