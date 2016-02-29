/*
 Make a simple numeric calculator. It should prompt the user for three numbers. 
Then add the numbers together and divide by 2. 
Display the result. Your program must support numbers with decimals and not just integers
 */
package dumb_calculator;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Dumb_Calculator {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double first,second,third,answer;
        
        System.out.print("What is your first number: ");
       first =  in.nextDouble();
          System.out.print("What is your second number: ");
        second = in.nextDouble();
          System.out.print("What is your third number: ");
        third  = in.nextDouble();
        answer = (first + second + third)/2.0; 
        System.out.println( "The answer is  " + answer);
    }
    
}
