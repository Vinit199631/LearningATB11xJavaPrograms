package TASKS;


import java.util.Scanner;

public class TASK012_Count_vowels {
    //Count vowels(a,e,i,o,u) 
    // and consonants in a String. → pramod, → vowels - 2, consonants - 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String str = scanner.nextLine().toLowerCase();


        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i<str.length() ; i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            
        }

    }
        System.out.println("vowels:    " + vowels);
        System.out.println("consonants:    " + consonants);

        scanner.close();



}
}




