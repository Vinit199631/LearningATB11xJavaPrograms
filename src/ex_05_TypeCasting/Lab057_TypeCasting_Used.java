package ex_05_TypeCasting;

public class Lab057_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course+GST; // Narrow - Impicit
        int total1 = course + (int) GST; // Narrow - Explicit - Always a data loss in this case
        System.out.println(total1);

        float total2 = course + GST; // Widening - auto - Implicit
        float total3 = (float)course + GST; // Widening - auto - Explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}

