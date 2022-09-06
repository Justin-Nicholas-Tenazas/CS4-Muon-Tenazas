/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

/**
 *
 * @author MUON
 */


public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String typeOne = "Zombie Dog";
        String typeTwo = "Licker";
        String typeThree = "Tyrant";
        
        int healthOne = 10;
        int healthTwo = 45;
        int healthThree = 200;
        
        boolean isDangerOne = false;
        boolean isDangerTwo = true;
        boolean isDangerThree = true;
        
        System.out.println("Speciman T-A \nName: " + typeOne + "\nHealth: " + healthOne + "\nDangerous? " + isDangerOne);
        System.out.println("Speciman T-C \nName: " + typeTwo + "\nHealth: " + healthTwo + "\nDangerous? " + isDangerTwo);
        System.out.println("Speciman T-X \nName: " + typeThree + "\nHealth: " + healthThree + "\nDangerous? " + isDangerThree);
        
        System.out.println("\nDoes T-A have less health than T-X?");
        if(healthOne < healthThree){System.out.println("Yes.");}
        
        
    }
}
