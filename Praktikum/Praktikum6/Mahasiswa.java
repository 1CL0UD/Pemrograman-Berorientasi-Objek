/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shalahuddin_praktikum6;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    public String nama, npm;
    private double nilaiUts, nilaiUas;
        
        
    public void insertNilaiUas(double nilai){
        nilaiUas=nilai;
    }
    public void insertNilaiUts(double nilai){
        nilaiUts=nilai;
    }
        
    public void dataMhs(){
        System.out.printf("Nama\t\t: %s\nNPM\t\t: %s\nNilai UAS\t: %.2f\nNilai UTS\t: %.2f\nNilai Akhir\t: %.2f\n", nama, npm, nilaiUas, nilaiUts, nilaiAkhir());
    }
        
    public double nilaiAkhir(){
        double avg=(nilaiUas+nilaiUts)/2;
        return avg;
    }
    
}
