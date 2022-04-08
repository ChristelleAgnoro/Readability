package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner readability = new Scanner(System.in);
        System.out.println("Text: ");
        String text = readability.nextLine();

        int count_Letter = 0;
        int count_Words = 1;


        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                count_Letter++;
        }

        for (int i = 0; i < text.length() - 1; i++) {
            if ((text.charAt(i) == ' ') && (text.charAt(i + 1) != ' ')) {
                count_Words++;
            }
        }
        int count_Sentences = text.split("[!?.:]+").length;

        System.out.println(count_Sentences + " Sentences");
        System.out.println(count_Letter + " letters.");
        System.out.println(count_Words + " Words");


        float L = 1.0f * count_Letter / count_Words * 100;
        float S = 1.0f * count_Sentences / count_Words * 100;

        int grade = (int) Math.round(0.0588 * L - 0.296 * S - 15.8);

        if (grade < 1) {
            System.out.println("Before Grade 1");
        }
        else if (grade >= 16)
            System.out.println("Grade 16+");
        else
            System.out.println("Grade: " + grade);

    }
}
