
package week_day_name;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Week_Day_Name {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int dayNumber;
        System.out.print("What day numbebr is today: ");
        dayNumber = input.nextInt();
        
        if (dayNumber == 1)
        {
            System.out.print("Today is a Sunday");
            
        }
        if (dayNumber == 2)
        {
            System.out.print("Today is a Monday");
            
        }
        if (dayNumber == 3)
        {
            System.out.println("Today is a Tuesday");
            
        }
        if (dayNumber == 4)
        {
            System.out.println("Today is a Wednesday");
            
        }
        if (dayNumber == 5)
        {
            System.out.println("Today is a Thursday");
            
        }
        if (dayNumber == 6)
        {
            System.out.println("Today is a Friday");
            
        }
        if (dayNumber == 7)
        {
            System.out.println("Today is a Saturday");
            
        }
        
    }
    
}
