package ex_17_OOPs_Constructor;

public class Lab174_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("AMIT",989887876,"ABC");
        Person p2 = new Person("SUMIT",989887976,"ABD");
        Person p3  = new Person();
        p3.name = "Shikha";
        System.out.println(p3.name);
        Person p4 = new Person("LUCKY",823424242);
        System.out.println(p4.address);
     p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();


}
}


class Person{

    String name;
    long phone;
    String address;

    Person(){


    }
    Person (String name_arg,long phone_long,String address_args){

        this.name = name_arg;
        this.address = address_args;
        this.phone = phone_long;

    }
    Person(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;

    }
void eat(){
    System.out.println(this.name + " is eating!");




}
}
