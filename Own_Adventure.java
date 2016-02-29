/*
 *Make a short "Choose Your Own Adventure" game. 
The starting room should give the user two choices. 
Then the second room they travel to should give them two more choices. Finally the third room should give them two choices.

This means your game will have eight possible "endings". 
Your game will also have a total of fifteen rooms:

 */

package own_adventure;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Own_Adventure {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String selection,kitchen,refrigerator,upstairs,bedroom,yes,no;
        selection = "";
        kitchen = "";
        upstairs = "";
        bedroom = "";
        refrigerator = "";
        yes = "";
        no = "";
        System.out.println("WELCOME TO THE RICCI ADVENTURE!");
        System.out.println();
        
        System.out.println("You are in a creepy house! Would you like to go Upstairs or into the Kitchen");
        if (selection.equals(kitchen))
        {
        
           System.out.println("There is a long countertop with dirty dishes everywhere. "
                   + "/n off to one side there is, as you'd expect,a refrigerator. /nYou may open the Refrigerator /nor look in a Cabinet ");
           
            if (selection.equals(upstairs))
            {
                System.out.println("Upstairs you see a hallway. At the end of the hallway is the master /nBedroom. There is also a Bathroom off the hallway. Where would you like");
                
                if (selection.equals(refrigerator))
                {
                   System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
"Would you like to eat some of the food? yes or no");
                   if(selection.equals(no))
                   {
                       System.out.println("You will die of starvation... eventually.");
                        
                       if (selection.equals(yes))
                       {
                           System.out.println("perfect");
                       }
                       
                   }
                           
                }
            }
            selection = input.next();
        } 
    }
    
}
