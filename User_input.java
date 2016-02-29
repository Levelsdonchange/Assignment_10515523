
package user_input;

import java.util.Scanner;

/**
 *
 * @author RICCI
 */
public class User_input {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String fName,sName,login,Name;
        double grade,studentId,gpa;
        
        
        System.out.print("First name: ");
        fName = in.next();
        System.out.print("Last name: ");
        sName = in.next();
        System.out.print("Grade(9-12): ");
        grade = in.nextDouble();
        System.out.print("Student ID: ");
        studentId = in.nextDouble();
        System.out.print("Login Name: ");
        login = in.next();
        System.out.print("GPA(0.0-4.0): ");
        gpa = in.nextDouble();
        System.out.println();
         
         Name = fName + sName;
        System.out.println("Your information: " );
        
        System.out.println();
        
        System.out.println("Login name: " +" "+ login);
        System.out.println("Your ID number is: " +" " + studentId + "\n");
        System.out.print("Name: " + Name + "\n");
        System.out.println("GPA: " + gpa + "\n");
        System.out.print("Grade: "+ grade + "\n");
    }
    
}
