
package string_input;

import javax.swing.JOptionPane;

/**
 *
 * @author RICCI
 */
public class String_Input {

    public static void main(String[] args) {
          String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"Hello, " + name + " ");
        JOptionPane.showMessageDialog(null,"Next year, you will be " + (age+1));
    }
    }
    

