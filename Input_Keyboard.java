// Take input from a person 
//Print out something to show how it changed
package input_keyboard;

import java.util.Scanner;

/**
 * @author RICCI
 */
public class Input_Keyboard {

    public static void main(String[] args) {
        
         Scanner keyboard = new Scanner(System.in);
         
         int age ;
         String height;
         double weight;
         
         System.out.print("How old are you? ");
         age = keyboard.nextInt();
         
         System.out.print("How tall are you? ");
         height = keyboard.next();
         
         System.out.print("How much do you weigh? ");
         weight = keyboard.nextDouble();
         
         System.out.println("So you are " + age + " years old " + height + " feet tall and " + weight + "kg heavy." );
         
    }
    
}
