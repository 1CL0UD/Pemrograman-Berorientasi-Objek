/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shalahuddinabdulaziz_praktikum5;

/**
 *
 * @author Praktikan
 */
public class ShalahuddinAbdulAziz_Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Shalahuddin", lastName = "Aziz";
        int age = 20;
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        
        String fullName = "Isal" + "Aziz";
        System.out.println(fullName);
        System.out.printf("Full Name: %s Age(string): %s\n", fullName, String.valueOf(age));
        
        
        String fullNameUpper = fullName.toUpperCase();
        String fullNameLower = fullName.toLowerCase();
        
        System.out.println("Upper Case: " + fullNameUpper);
        System.out.println("Lower Case: " + fullNameLower);
        System.out.println(fullName.length());
        
        System.out.println(firstName.trim().substring(0, 4));
        int ind = fullName.indexOf("sa");
        System.out.println(ind);
    }
    
}
