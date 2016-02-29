package age_stuff;

import java.util.Scanner;
/**
 *
 * @author RICCI
 */
public class Age_Stuff {
    public static void main(String[] args) {
        double age;
        age = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Your name: ");
        String name;
        name = input.nextLine();
        
        System.out.println();
        System.out.println("Your age: ");
         age = input.nextDouble();
        if(age < 16 )
        {
            System.out.print("You can't drive.");
        }
        if (age < 16 && age >= 17)
        {
            System.out.print("You can driv but note vote"); 
            
        }
        if(age >= 18 && age <= 24)
        {
             System.out.print("You can vote but not rent a car.");
        }
        if (age>= 25)
        {
             System.out.print("You can do pretty much anything");
        }
       else
        {
            System.out.printf("Sorry, %s!!!", name);
        }
        
    }
    
}
