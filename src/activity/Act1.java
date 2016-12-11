/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;
import javax.swing.*;
/**
 *
 * @author justine
 */
public class Act1 {
    public static void main(String args[]){
        double con = 1.60935;
        double km;
        String mile;
        mile = (String)JOptionPane.showInputDialog(null,"What is the value of miles?", "Convertion of Miles to Kilometer",JOptionPane.INFORMATION_MESSAGE,null,null,"0");
        km = Double.parseDouble(mile)*con;
        JOptionPane.showMessageDialog(null, "The value of "+mile+"M is equal to "+km+"km");
        
    }
}
