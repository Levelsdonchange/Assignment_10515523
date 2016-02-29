/*
 Ask the user for their name. Then display their name to prove that you can recall it. 
Ask them for their age. Then display that. Finally, ask them for how much they make and display that. 
You should use the most appropriate data type for each variable.
 */
package name_age_salary;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class Name_Age_Salary {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String name;
        int age;
        double salary;;
        
        System.out.print("Hello!! Whats your name: ");
        name = in.next();
        
        System.out.println("Hi, " + name + " How old are you");
        age = in.nextInt();
        
        System.out.println("Ok " + age + "year old "+ name);
        System.out.println("How much do you make? " +" "+ name );
       salary =  in.nextDouble();
        
       System.out.println(salary +"?"+" "+ "well i hope you are content");
    }
    
}
