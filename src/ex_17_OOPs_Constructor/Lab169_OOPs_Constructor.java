package ex_17_OOPs_Constructor;

public class Lab169_OOPs_Constructor {

    public static void main(String[] args) {

        Baby b1 = new  Baby();
        new Baby();
        Baby b2;
    }

}
class Baby{
    String name;

     void cry(){

         System.out.println("Cry");
     }
     void sleep(){

         System.out.println("Sleep");
     }
     void eat  (){

         System.out.println("Eat");
     }

     Baby(){
         System.out.println("I am called, Default Constructor!");
     }














        }
