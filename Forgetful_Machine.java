/*
 Ask the user for two words and two numbers 
and let the person at the keyboard type in some values 
don't store the values .
 */
package forgetful_machine;
import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Forgetful_Machine {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me a word!");
        input.next();
        
        System.out.println("Give me a second word!");
        input.next();
        
        System.out.println("Cool, now your favorite number?");
        input.nextInt();
        
        System.out.println("And your second favorite number?");
        input.nextInt();
        
        System.out.println("Wow! Wasnt that fun?");
    }
    
}
