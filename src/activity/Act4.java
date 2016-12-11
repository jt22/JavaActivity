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
public class Act4 {
//    int minutes;
//    int getMinute(){
//        return(minutes);
//    }
//    void setMinute(int minutes){
//        
//    }
//    void conMinute(){
//        
//    }
    public static void main(String arg[]){
        String min;
        double HourCon,MinCon;
        int minutes,hour;
        String defaultv = "0";
        min = (String)JOptionPane.showInputDialog(null,"How many minutes worked on job?","Minutes Worked",JOptionPane.INFORMATION_MESSAGE,null,null,defaultv);
        HourCon = Double.parseDouble(min)/60;
        hour = (int)HourCon;
        MinCon = (HourCon - hour)*60;
        minutes = (int)MinCon;
        JOptionPane.showMessageDialog(null, ""+min+"minutes becomes "+hour+"hour and "+minutes+"minutes");
    }
}
