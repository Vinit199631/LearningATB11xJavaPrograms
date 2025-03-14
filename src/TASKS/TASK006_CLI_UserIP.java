package TASKS;

public class TASK006_CLI_UserIP {
    //Take a user input - Name, Age and Salary and print them in the end.
    public static void main(String[] args) {

    String name = args[0];
        System.out.println("Name:" + name);

        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
//Output :- Name:Vinit , Age:28 , Salary:40000

    }
}
