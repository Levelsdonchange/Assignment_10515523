
package bmi.categories;

import java.util.Scanner;
/**
 * @author RICCI
 */
public class BMICategories {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height, yourBMI;
    int weight;

    System.out.print( "Your height in m: " );
    height = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    weight = keyboard.nextInt();
    System.out.println();

    yourBMI = weight / (height * height);
    System.out.println( "Your BMI is " + yourBMI );
    yourBMI = keyboard.nextDouble();

    if ( yourBMI < 18.5 )
    {
        System.out.println( "BMI Category: Underweight" );
    }

    else if ( yourBMI >= 18.5 && yourBMI <= 24.9 )
    {
        System.out.println( "BMI Category: Normal weight" );
    }

    else if ( yourBMI >= 25.0 && yourBMI <= 29.9 )
    {
        System.out.println( "BMI Category: Overweight" );
    }

    else if ( yourBMI >= 30.0 )
    {
        System.out.println( "BMI Category: Obese" );
    }

}

}

      
   
    


