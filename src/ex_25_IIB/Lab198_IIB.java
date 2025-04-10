package ex_25_IIB;

public class Lab_198_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```
    public static void main(String[] args) {
        A a = new A();
        new A();

    }


}


class A {
    A (){
        System.out.println("DC"); // DC can be only one
    }

    {
        System.out.println("Hi , I am IIB"); // IIB can be n numbers
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }
    {
        System.out.println("Hi , I am IIB 2");
    }
}