/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;
import javax.swing.*;
import java.lang.*;

/**
 *
 * @author justine
 */
public class Act3 {
    public static void main(String args[]){
        String defaultv = "0";
        String SecVal;
        double HourCon;
        double SecCon;
        int hour,min,sec;
        double MinCon;
        SecVal = (String)JOptionPane.showInputDialog(null, "What is the value of seconds?", "Value of Seconds", JOptionPane.INFORMATION_MESSAGE,null,null,defaultv);
        HourCon = Double.parseDouble(SecVal)/3600;
        hour = (int)HourCon;
        MinCon = (HourCon - hour)*60;
        min = (int)MinCon;
        SecCon = (MinCon - min)*60;
        sec = (int)SecCon;
        JOptionPane.showMessageDialog(null, ""+SecVal+"seconds is equivalent to "+hour+"hour,"+min+"minutes,"+sec+"seconds");
    }
}
