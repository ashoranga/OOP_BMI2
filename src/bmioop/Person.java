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
public class Person {
    String name;
    int age;
    double ht;
    double wt;
    double bmi;
    
    
public void CalculateBmi () {
    bmi = (wt/(ht/100*ht/100));
}
public void ClazifyBmi () {
    if (bmi<18.5) {
        JOptionPane.showMessageDialog(null,name+"'s BMI is "+bmi+" - Underweight");
    }
    if ((bmi>=18.5)&&(bmi<=25)){
        JOptionPane.showMessageDialog(null,name+"'s BMI is "+bmi+" - Healthy");
    }
    if ((bmi>25)&&(bmi<=30)){
        JOptionPane.showMessageDialog(null,name+"'s BMI is "+bmi+" - Overweight");
    }    
    if (bmi>30){
        JOptionPane.showMessageDialog(null,name+"'s BMI is "+bmi+" - Obese");    
    
    
}   
    
}
}
