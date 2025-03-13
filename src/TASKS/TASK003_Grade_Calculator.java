package TASKS;

public class TASK003_Grade_Calculator {
    public static void main(String[] args) {
        String score1 = args[0];
        int score = Integer.parseInt(score1);

        String result = (score >=90&& score<=100) ?"A":
                        (score >=80 && score<90) ?"B":
                        (score >=70 && score<80) ?"C":
                        (score >=60 && score<70) ?"D":
                        (score >=0 && score<60) ?"F":"Invalid Input";
        System.out.println("Grade for this score " + score + " is " + result);

        }
}
