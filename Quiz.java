/*
 Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something. 
It must keep track of how many they get wrong, 
and print out a "score" at the end.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Quiz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Capital ;
         
        int ans2,ans1;
        System.out.println("What is 5 + 10?");
        
        
        System.out.println("1. 0");
        System.out.println("2. 15");
        System.out.println("3. 25");
        Capital = in.nextDouble();
       
        
        if (Capital == 2)
        {
            System.out.print("You are correct");
        }
            
        else if (Capital== 1 || Capital== 3)
        {
            System.out.print("You are wrong");
        }
        
          System.out.println();
          
          System.out.print("Does a computer science student read CSCD202?/n");
          System.out.println();
          System.out.print("1.No  2. Yes\n");
          ans1 = in.nextInt();
          if (ans1==2)
          {
              System.out.println("Corect");
          }
          else if(ans1==1)
          {
              System.out.println("Sorry, but you should know better.");
          }
          
          

             System.out.println();
             System.out.print("What is the square root of 9\n");
             System.out.println("1. 2 ");
             System.out.println("2. 3");
             System.out.println("3. 3.2 ");
              ans2 = in.nextInt();
             if (ans2 == 2)
             {
                 System.out.print("Correct");
                         
             }
             else if(ans2 == 1|| ans2 == 3)
             {
                 System.out.print("Wrong");
             }
    }
    
}
