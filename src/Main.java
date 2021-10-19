package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question = "What do Klingons drink in the morning?";
        String choiceOne = "p'tagh";
        String choiceTwo = "raktajino";
        String choiceThree = "romulan ale";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        
        String answer = input.next();

        if (correctAnswer.equals(answer.toLowerCase())) {
            System.out.println("Correct! Klingons drink " + correctAnswer);
        } else {
            System.out.println("False, klingons drink " + correctAnswer);
        }


    }
}