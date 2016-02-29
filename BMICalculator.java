package bmi.calculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double heightMeter, bodyMass, massPound, heightInches, massKilo, feet, heightMeter2;

    massKilo = 0;
    heightMeter = 0;
    heightInches = 0;
    massPound = 0;
    feet = 0;
    heightMeter2 = 0;

    System.out.print( "Your height in m: " );
    heightMeter = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    massKilo = keyboard.nextDouble();

    System.out.println( "Your BMI is " + massKilo / (heightMeter * heightMeter) );



    System.out.print( "Your height in inches: " );
    heightInches = keyboard.nextDouble();
    heightMeter = heightInches * 0.0254;

    System.out.print( "Your weight in pounds: " );
    massPound = keyboard.nextDouble();
    massKilo = massPound * 0.453592;

    System.out.println( "Your BMI is " + massKilo / (heightMeter * heightMeter) );


    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextDouble();
    feet = feet * 12;

    System.out.print( "Your height (inches): " );
    heightInches = keyboard.nextDouble();
    heightMeter2 = (feet + heightInches) * 0.453592;

    System.out.print( "Your weight in pounds: " );
    massPound = keyboard.nextDouble();
    massKilo = massPound * 0.453592;

    System.out.println( "Your BMI is " + massKilo / (heightMeter2 + heightMeter2) );

}

    }
    

