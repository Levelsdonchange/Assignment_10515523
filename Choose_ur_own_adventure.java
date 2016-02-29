
package choose_ur_own_adventure;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Choose_ur_own_adventure {

    public static void main(String[] args) {
        
		Scanner keyboard = new Scanner(System.in);
		
		String q1, q1_2, q1_3;
		
		System.out.println("WELCOME TO RICCI'S TINY ADVENTURE! \n");
		
		System.out.println("You and your friends enter the \"Haunted House\" at the end of the street \nfrom a lost bet. When you enter you find what you would expect from a \nabandoned house just a bunch of scattered items and old furniture. \nYou explore the 1st floor to find nothing too interesting. \n \nDo you investigate upstairs or the basement? \n");
		q1 = keyboard.next();
		String Q1 = q1.toUpperCase();
		
		//UPSTAIRS
		if (Q1.equals("UPSTAIRS")) 
		{
			System.out.println("\nYou find that there are 2 rooms, the room on the right seems to be the \nmaster bedroom, and the room on the left seems to be the kids room.\n\nSo what is it right or left? \n");
			q1_2 = keyboard.next();
			String Q1_2 = q1_2.toUpperCase();
			if (Q1_2.equals("LEFT")) 
			{
				System.out.println("\nIn the kids room you find a closet with a strange light coming out of it.\n\nDo you go open the closet(YES or NO)?\n");
				q1_3 = keyboard.next();
				String Q1_3 = q1_3.toUpperCase();
				if (Q1_3.equals("YES")) 
				{
					System.out.println("\nWhen you open the closet you find a child hiding with a flash light \npointing towards his face. He jumps out and hugs you for saving him \nfrom the scary monsters. You are the town hero, you win!");
				} 
				else if (Q1_3.equals("NO")) 
				{
					System.out.println("\nYou run out of the house scared, and go back home. The next morning \nyou read the paper about a kid was found mutilated in the haunted house \ndown the street you feel guilty and realize that the light was probably the kid and whatever else is in that house killed him. \nYou lose...");
				} 
				else
				{
					System.out.println("\nSorry I do not recognize that command.");
				}
			} 
			else if (Q1_2.equals("RIGHT")) 
			{
				System.out.println("\nWhen you enter the master bedroom you see a very unusual seen the \nroom is not completely trashed it's like it was untouched by the world. \nThe only weird thing was one tear on the wallpaper, you pull away at \nthe wallpaper and reveal a bloody text saying \"GET OUT!\" \n \nDo you leave or investigate further(INVESTIGATE or LEAVE)?\n");
				q1_3 = keyboard.next();
				String Q1_3 = q1_3.toUpperCase();
				if (Q1_3.equals("INVESTIGATE")) 
				{
					System.out.println("\nYou look further into the room only to find out why this house is so \nhaunted a ghost looks you in the eyes and the sudden feeling of \ndepression falls in and you pick up a rock and smash it into your head. \nYou lose...");
				} 
				else if (Q1_3.equals("LEAVE")) 
				{
					System.out.println("\nYou leave and avoid your death. You Win!");
				}
				else 
				{
					System.out.println("\nSorry I do not recognize that command.");
				}
			} 
			else 
			{
				System.out.println("\nSorry I do not recognize that command.");
			}
		//BASEMENT
		} 
		else if (Q1.equals("BASEMENT")) 
		{
			System.out.println("\nYou go into the basement and find \na very creepy environment with what looks like to be storage for whoever \nused to live here. You find a door that has a sign above saying \nsomething in russian so you don't undertand anything.\n\nDo you go inside(YES or NO)?\n");
			q1_2 = keyboard.next();
			String Q1_2 = q1_2.toUpperCase();
			if (Q1_2.equals("YES"))
			{
				System.out.println("\nWhen you enter the door you find a long tunnel, so long you can't \nsee the end, it is also very dark.\n\nDo you go down the tunnel(YES or NO)?\n");
				q1_3 = keyboard.next();
				String Q1_3 = q1_3.toUpperCase();
				if (Q1_3.equals("YES"))
				{
					System.out.println("\nYou continue down the tunnel only to find nothing so you turn around \nand go back to the door only to find that the door is gone it is now \njust a wall. You spend the rest of your life in this tunnel and die \nof starvation. You Lose.");
				} 
				else if (Q1_3.equals("NO"))
				{
					System.out.println("\nYou leave the tunnel and the house unharmed. You Win!");
				}
				else
				{
					System.out.println("\nSorry, I did not recognize that command.");
				}
			}
			else if (Q1_2.equals("NO")); 
			{
				System.out.println("\nYou decide to not go into tunnel and turn around to leave and find that \nsomething or somebody has blocked up the stairwell with what looks \nlike all the furniture from upstairs.\n\nWill you attempt to remove them or accept your fate(REMOVE or DO NOTHING)?\n");
				q1_3 = keyboard.next();
				String Q1_3 = q1_3.toUpperCase();
				if (Q1_3.equals("REMOVE")) 
				{
					System.out.println("\nYou remove all of the furniture but it takes you a whole day. You get \nout but what ever was in there still haunts you till this day.\nYou win..");
				} 
				else if (Q1_3.equals("NOTHING"))
				{
					System.out.println("\nYou accept your fate and slowly die of starvation.. You Lose.");
				} 
				else
				{
					System.out.println("\nSorry I did no recognize that command.");
				}
			}
		} 
		else 
		{
			System.out.println("\nSorry I did no recognize that command.");
		}
    }
    
}
