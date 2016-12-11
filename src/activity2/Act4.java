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
public class Act4 {
    public static int sumRange(int a, int b){
        int sum = 1;
        int x;
        for(x=a;x<=b;x++)
        {
            sum +=x;
        }
        return(sum);
    }
    public static void main(String args[]){
        System.out.println(sumRange(1,6));
    }
}
