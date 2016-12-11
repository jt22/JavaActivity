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
public class Act2 {
    public static void main(String args[]){
        String vhour,vmin,vsec;
        double chour,cmin;
        double hsec,msec,ssec,secc;
        String defaultv = "0";
        vhour = (String)JOptionPane.showInputDialog(null,"What is the value of hour?" , "Value of Hour",JOptionPane.INFORMATION_MESSAGE,null,null,defaultv );
        vmin = (String)JOptionPane.showInputDialog(null,"What is the value of minutes?" ,"Value of Minutes",JOptionPane.INFORMATION_MESSAGE,null,null,defaultv);
        vsec = (String)JOptionPane.showInputDialog(null,"What is the value of seconds?" ,"Value of Seconds",JOptionPane.INFORMATION_MESSAGE,null,null,defaultv);
        hsec = Double.parseDouble(vhour)*3600;
        msec = Double.parseDouble(vmin)*60;
        ssec = Double.parseDouble(vsec);
        secc = hsec+msec+ssec;
        JOptionPane.showMessageDialog(null, ""+vhour+"hour, "+vmin+"minutes, "+vsec+"seconds is equivalent to "+secc+"seconds ");
    }
}
