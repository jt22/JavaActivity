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
public class Act6 {
    public static void main(String args[]){
        String defaultv = "0";
        String dollar;
        int hundred,fifty,twenty,ten,five,two,one;
        double DollarCon,HundCon,FifCon,TwenCon,TenCon,FiveCon,TwoCon,OneCon;
        dollar = (String)JOptionPane.showInputDialog(null,"What is the value of Dollar?","Value of Dollar",JOptionPane.INFORMATION_MESSAGE,null,null,defaultv);
        DollarCon = Double.parseDouble(dollar);
        HundCon = DollarCon/100;
        hundred = (int)HundCon;
        FifCon = DollarCon/50;
        fifty = (int)FifCon;
        TwenCon = DollarCon/20;
        twenty = (int)TwenCon;
        TenCon = DollarCon/10;
        ten = (int)TenCon;
        FiveCon = DollarCon/5;
        five = (int)FiveCon;
        TwoCon = DollarCon/2;
        two = (int)TwoCon;
        OneCon = DollarCon/1;
        one = (int)OneCon;
        JOptionPane.showMessageDialog(null, ""+dollar+" is equivalent to \n"+hundred+" : $100\n"+fifty+" : $50\n"+twenty+" : $20\n"+ten+" : $10\n"+five+" : $5\n"+two+" : $2\n"+one+" : $1");
    }
}
