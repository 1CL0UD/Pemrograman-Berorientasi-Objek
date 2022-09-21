/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shalahuddin_praktikum4;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Shalahuddin_Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int num[] = {1, 3, 5, 7, 9};
//        System.out.println(num.length);
//        for(int number : num){
//            System.out.println(number);
//        }
//        String str[] = {"test", "test2", "ttest3", "test4"};
//        for (String str1 : str) {
//            System.out.println(str1);
//        }
        
//        Scanner sc = new Scanner(System.in);
//        
//        int intg[] = {};
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            intg[i]=sc.nextInt();
//        }
//        
//        for(int str1 : intg){
//            System.out.println(str1);
//        }
        
//        Scanner sc = new Scanner(System.in);
//        int nilai[] = new int[3];
//        System.out.println("Nilai Matematika: ");
//        nilai[0] = sc.nextInt();
//        System.out.println("Nilai Logika: ");
//        nilai[1] = sc.nextInt();
//        System.out.println("Nilai Bahasa: ");
//        nilai[2] = sc.nextInt();
//        
//        for(int prtn: nilai){
//            System.out.println(prtn);
//        }
//        
//        nilai[1]=89;
//        
//        for(int prtn: nilai){
//            System.out.println(prtn);
//        }
        
        int[][] multi={
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        
        for(int i[]: multi){
            for(int j : i){
                System.out.printf("%d \n", j);
            }
        }
        
        multi[0][1]=70;
        
        for(int i[]: multi){
            System.out.print("[");
            for(int j : i){
                System.out.print(j+", ");
            }
            System.out.println("]");
        }
    }
    
}
