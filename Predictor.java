/*
Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. 
Then display what their age would be five years from now. 
Then display what their age would be five years ago

 */
package predictor;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Predictor {

    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in) ;
       
       String name;
       int Age_1, Age_2, Age_3;
       
       System.out.print("Hi am RICCI, what is your name? \n");
       name = in.next();
       
       System.out.print("Hi, " + " "+ name +"!" +" "+ "How old are you? \n");
       Age_1 = in.nextInt();
       
       Age_2 = Age_1 + 5;
       Age_3 = Age_1 - 5;
       
       System.out.println(name+" " + "Do you know that in five years you will be " + Age_2 +" years old?\n");
       System.out.println("If am correct even five years ago you were " + Age_3 + " years old right?\n");
    }
    
}
