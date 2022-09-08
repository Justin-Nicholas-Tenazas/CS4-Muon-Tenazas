/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2ex2;

/**
 *
 * @author MUON
 */
import java.util.Scanner;
public class Q2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Higher or Lower! What would you want to do? Type in the number of your choice! \n[1] Start playing \n[2] Change game settings \n[3] Quit game");
        String startup = sc.nextLine();
        switch(startup) {
            case "1": break;
            
            case "2": break;
            
            case "3": System.out.println("See you next time!");
            break;
        
        }
    }
    
}
