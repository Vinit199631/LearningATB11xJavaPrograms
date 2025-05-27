package practice_daily;

public class P1_Grade_Calculator {
    //Write a program that calculates and displays the letter
    // grade for a given numerical score (e.g., A, B, C, D, or F)
    // based on the following grading scale:
    // A: 90-100
    // B: 80-89
    // C: 70-79
    // D: 60-69
    // F: 0-59
    public static void main(String[] args) {
        String score1 = args[0];
        int score = Integer.parseInt(score1);
        String result = (score >=90&& score<=100) ?"A":
                        (score >=80 && score<90) ?"B":
                        (score >=70 && score<80) ?"C":
                        (score >=60 && score<70) ?"D":
                        (score >=0 && score<60) ?"F":"Invalid Input";
        System.out.println(result);


    }
}
