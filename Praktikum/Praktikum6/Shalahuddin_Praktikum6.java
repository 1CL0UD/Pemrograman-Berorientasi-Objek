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
public class Shalahuddin_Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        
        mhs1.nama="Shalahuddin Abdul Aziz";
        mhs1.npm="2117051083";
        
        mhs1.insertNilaiUts(95);
        mhs1.insertNilaiUas(180);
        
        mhs1.dataMhs();
        
        Mahasiswa mhs2=new Mahasiswa();
        
        mhs2.nama="Hamzah Hanif";
        mhs2.npm="2117051032";
        
        mhs2.insertNilaiUts(100);
        mhs2.insertNilaiUas(190);
        
        mhs2.dataMhs();
        
    }
    
    
    
}
