package space_boxing2;
import java.util.Scanner;
/**
 *
 * @author RICCI
 */
public class Space_Boxing {

    public static void main(String[] args) {
        
   //initializations 
  double currentweight = 1;
  double venus = .78;
  double mars = .39;
  double jupiter = 2.65;
  double saturn = 1.17;
  double uranus = 1.05;
  double neptune = 1.23;
  int menu = 9;
  Scanner sc  = new Scanner (System.in);
  //end of initializations

 //header message and current weight input
      System.out.println ("You are an interplanetary boxer, and need to make"
              + " weight on each of the different weights.");
      System.out.print ("Please enter your current weight on Earth: ");   
            currentweight = sc.nextDouble();
      System.out.println (" ");      
  //end of header and current weight input

       while (menu != 0) { //for the program to reiterate
    //planet menu
       System.out.println ("I have information for the following planets:");
       System.out.println (" "); 
       System.out.println ("    1. Venus    2. Mars    3. Jupiter");
       System.out.println ("    4. Saturn   5. Uranus  6. Neptune");
       System.out.println ("    Press 0 to exit.");
       System.out.println (" ");           
       System.out.print ("Which planet are you visiting? ");               
       menu = sc.nextInt();
       if (menu < 0 || menu > 6) { //entry check
                System.out.println ("Not a valid entry."); 
                menu = 9; } //end entry check

       //Venus
       else if (menu == 1) {
        System.out.println (" ");
        System.out.println ("Your weight on Venus is: " + currentweight*venus);
        System.out.println (" ");
        System.out.println ("Do you want to perform another calculation?");
        System.out.println ("    1. Yes    2. No");
        System.out.print ("Enter your selection: ");
        menu = sc.nextInt();
            if (menu == 1){ menu = 9;}
            else if(menu == 2) { menu = 0;}
        } //end Venus

       //Mars
       else if (menu == 2) {
        System.out.println (" ");   
        System.out.println ("Your weight on Mars is: " + currentweight*mars);
        System.out.println (" ");
        System.out.println ("Do you want to perform another calculation?");
        System.out.println ("    1. Yes    2. No");
        System.out.print ("Enter your selection: ");
        menu = sc.nextInt();
            if (menu == 1){ menu = 9;}
            else if(menu == 2) { menu = 0;}
        } //end Mars

       //Jupiter
       else if (menu == 3) {
        System.out.println (" ");
        System.out.println ("Your weight on Jupiter is: " + currentweight*jupiter);
        System.out.println (" ");
        System.out.println ("Do you want to perform another calculation?");
        System.out.println ("    1. Yes    2. No");
        System.out.print ("Enter your selection: ");
        menu = sc.nextInt();
            if (menu == 1){ menu = 9;}
            else if(menu == 2) { menu = 0;}
        } //end Jupiter

       //Saturn
       else if (menu == 4) {
        System.out.println (" ");
        System.out.println ("Your weight on Saturn is: " + currentweight*saturn);
        System.out.println (" ");
        System.out.println ("Do you want to perform another calculation?");
        System.out.println ("    1. Yes    2. No");
        System.out.print ("Enter your selection: ");
        menu = sc.nextInt();
            if (menu == 1){ menu = 9;}
            else if(menu == 2) { menu = 0;}
        } //end Saturn

       //Uranus
       else if (menu == 5) {
        System.out.println (" ");
        System.out.println ("Your weight on Uranus is: " + currentweight*uranus);
        System.out.println (" ");
        System.out.println ("Do you want to perform another calculation?");
        System.out.println ("    1. Yes    2. No");
        System.out.print ("Enter your selection: ");
        menu = sc.nextInt();
            if (menu == 1){ menu = 9;}
            else if(menu == 2) { menu = 0;}
        } //end Uranus

       //Neptune
       else if (menu == 6) {
        System.out.println (" ");
        System.out.println ("Your weight on Neptune is: " + currentweight*neptune);
        System.out.println (" ");
        System.out.println ("Do you want to perform another calculation?");
        System.out.println ("    1. Yes    2. No");
        System.out.print ("Enter your selection: ");
        menu = sc.nextInt();
            if (menu == 1){ menu = 9;}
            else if(menu == 2) { menu = 0;}
        }//end Neptune

  } // end first while loop for the program to reitirate
    }
    
}
