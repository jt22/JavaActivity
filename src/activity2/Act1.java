/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author justine
 */
public class Act1 {
    
    public static void powersOfTwo(){
        int n,x;
        for(x=1;x<=10;x++){
           System.out.println("2^ "+x+" = "+Math.pow(2, x));
        }
    }
    public static void main(String args[]){
        powersOfTwo();
    }
}
