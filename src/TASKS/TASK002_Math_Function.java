package TASKS;

public class TASK002_Math_Function {
//    X = 10 , Y = 10 , Z = 10 , Result
public static void main(String[] args) {
    int X = 10;
    int Y = 10;
    int Z = 10;
    double result = Math.pow(3 * (Math.pow(X, 2) + Math.pow(Y, 2) - Math.abs(Z)), 1.0 / 3.0);
    System.out.println(result);
}
}
