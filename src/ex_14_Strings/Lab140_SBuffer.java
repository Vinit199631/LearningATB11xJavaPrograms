package ex_14_Strings;

public class Lab140_SBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Vinit");
        stringBuffer.append("Bhosale");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());



        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2; // creates new string hello world!
        System.out.println(s3);// Output : Hellw World!\
        System.out.println(s1);
    }
}
