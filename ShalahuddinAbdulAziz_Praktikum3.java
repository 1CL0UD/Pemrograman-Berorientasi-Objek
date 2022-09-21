/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shalahuddinabdulaziz_praktikum3;

import java.util.Scanner;


/**
 *
 * @author Praktikan
 */
public class ShalahuddinAbdulAziz_Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.print("Masukkan nilai: ");
            int nilai = sc.nextInt();
            if(nilai>100){
                System.out.println("Input melebihi batas");
                break;
            }
            if((nilai%10)==0){
                continue;
            }
            char letter;
            if(nilai>=76){
                letter='A';
                System.out.print(letter);
            }else if(nilai>=71){
                letter='B';
                System.out.print(letter);
            }else if(nilai>=66){
                letter='C';
                System.out.print(letter);
            }else{
                letter='D';
                System.out.print(letter);
            }
        
            switch(letter){
                case 'A':
                    System.out.println(" - Sangat Baik");
                    break;
                case 'B':
                    System.out.println(" - Baik");
                    break;
                case 'C':
                    System.out.println(" - Cukup");
                    break;
                case 'D':
                    System.out.println(" - Kurang");
                    break;
                default:
                    System.out.println("Huruf Mutu Tidak Sesuai");
                    
                }
            break;
            }
            
        }
        
        
//        if(nilai>=76){
//            System.out.println("Anda Lulus");
//        }else if(nilai>71){
//            System.out.println("Nilai Anda B+");
//        }else{
//            System.out.println("Nilai Anda Tidak Memenuhi");
//        }
        
        
    
}
