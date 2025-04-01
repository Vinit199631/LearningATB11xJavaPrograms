package ex_16_OOPs;

public class Lab164_OOPs {

}
class persons{
    //Attributes,Properties,Data Members,Instance variables- all are same
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;



    //Bheaviour ,Function , Method - all are same
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(String name){
        return "Hello" +name;
    }

    void talk(){
        System.out.println("Talking");
    }
    int remaining_amount_sal(int salary,int tax){
        return salary-tax;
    }



}
