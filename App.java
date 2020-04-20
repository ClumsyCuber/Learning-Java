package com.company.packs;

import java.util.Scanner;
public class App {
    public static void main(String [] args) {
        Scanner ki = new Scanner(System.in);
        Question q1 = new Question("What color are apples?\n(a)red\n(b)orange\n(c)magenta", "red", "a");
        Question q2 = new Question("What color are bananas?\n(a)red\n(b)yellow\n(c)blue", "yellow", "b");

        int score = 0;

        System.out.print(q1.prompt);
        String attempt1 = ki.nextLine();
        System.out.print(q2.prompt);
        String attempt2 = ki.nextLine();

        if(attempt1.equals(q1.ans) || attempt1.equals(q1.answer)) {
            score = score + 1;
        }
        if(attempt2.equals(q2.ans) || attempt2.equals(q2.answer)) {
            score = score + 1;
        }
        if(score == 2) {
            System.out.println("Congratulations! You win. \nYour score is " + score + "/2");
        } else {
            System.out.println("Your score is " + score + "/2");
        }

    }
}
