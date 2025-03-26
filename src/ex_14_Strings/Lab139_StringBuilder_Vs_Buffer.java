package ex_14_Strings;

public class Lab139_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String - 90% you will be using
        String s0 = "Vinit";
        String s1 = new String ("Vinit");

        // less than 10% uses in automation
        StringBuffer stringBuffer = new StringBuffer("Vinit");
        StringBuilder stringBuilder = new StringBuilder("Vinit");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);



    }
}
