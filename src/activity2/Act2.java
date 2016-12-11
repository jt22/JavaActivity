/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
import java.util.Scanner;
/**
 *
 * @author justine
 */
public class Act2 {
    public static void alarm(){
        int x;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(x=1;x<=n;x++){
            System.out.println("Alarm!\n");
        }
    }
    public static void main(String arg[]){
        alarm();
    }
}
