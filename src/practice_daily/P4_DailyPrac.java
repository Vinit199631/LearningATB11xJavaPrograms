package practice_daily;



public class P4_DailyPrac {
    public static void main(String[] args) {


    //Write a program that checks the grade of a student based on their score:
    //Score >= 90: Grade A
    //Score >= 80 and < 90: Grade B
    //Score >= 70 and < 80: Grade C
    //Score >= 60 and < 70: Grade D
    //Score < 60: Grade F

    String score1 = args[0];
    int score = Integer.parseInt(score1);
    String result = (score >= 90 && score <= 100) ? "A" :
            (score >= 80 && score < 90) ? "B" :
                    (score >= 70 && score < 80) ? "C" :
                            (score >= 60 && score < 70) ? "D" :
                                    (score >= 0 && score < 60) ? "F" : "Invalid Input";
        System.out.println("Grade for this score "+score +" is "+result);

}
}

