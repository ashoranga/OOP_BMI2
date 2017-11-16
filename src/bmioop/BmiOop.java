/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bmioop;

import javax.swing.JOptionPane;

/**
 *
 * @author Ashoranga
 */
public class BmiOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ans;
        
        do {
        Person p1 = new Person();
        p1.name = JOptionPane.showInputDialog("Name");
        p1.ht = Double.parseDouble(JOptionPane.showInputDialog("Hight in cm"));
        p1.wt = Double.parseDouble(JOptionPane.showInputDialog("Weight in Kg"));
        p1.CalculateBmi();
        p1.ClazifyBmi();
        ans = JOptionPane.showInputDialog(null,"Calculate again? (y/n)");
        }while (ans.equals("y"));
              JOptionPane.showMessageDialog(null, "Thank You for using BMI");
         
        // TODO code application logic here
    }
}
