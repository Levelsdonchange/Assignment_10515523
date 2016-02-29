package twenty_questions;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Twenty_Questions {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

    String q1, q2, answer;

    answer = "object";

    System.out.println("TWO QUESTIONS!");
    System.out.println("Think of an object, and I'll try to guess it.");
    System.out.println();

    System.out.println("Question 1) Is it an animal, a vegetable, or a mineral? ");
    q1 = keyboard.next();
    System.out.println();

    System.out.println("Question 2) Is it bigger than a breadbox?");
    q2 = keyboard.next();
    System.out.println();

    if (q2.equals("no")) {
        if (q1.equals("animal")) {
            answer = "squirrel";
        } else if (q1.equals("vegetable")) {
            answer = "carrot";
        } else if (q1.equals("mineral")) {
            answer = "paper clip";
        }
    } else if (q2.equals("yes")) {
        if (q1.equals("animal")) {
            answer = "moose";
        } else if (q1.equals("vegetable")) {
            answer = "watermelon";
        } else if (q1.equals("mineral")) {
            answer = "Camaro";
        }
    } else {
        System.out.print("Please type yes or no!");
    }

    System.out.println("My guess is that you are thinking of a " + answer);
    System.out.println("I would aks you if I'm right, anyway it was fun wasn't it.");
    }
    
}
