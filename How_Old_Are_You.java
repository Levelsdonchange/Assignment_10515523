/*
 Make a program which displays a different message depending on the age given. 
Here are the possible responses:
 */
package how_old_are_you;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class How_Old_Are_You {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age = 0;
        
        System.out.println("Hey, Whats your name? ");
        name = input.next();
        
        System.out.print("Ok " + name + " how old are you?\n");
        age = input.nextInt();
        if (age < 12 && age < 18)
        {
          System.out.println("You cant drive" );
          System.out.println("You cant vote" );
          System.out.println("You cant rent a car");
          
        }
        else if(age>= 18)
        {
            System.out.println("You have the legal right to vote");
        }
          
    }
    
}
