/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shalahuddin_praktikum7;

import static java.lang.Math.pow;

/**
 *
 * @author Praktikan
 */

// class Segiempat{
//     public int luas(int sisi){
//         return (int) pow(sisi, 2);
//     }
// }

class Mahasiswa{
    private String nama, npm;
    private double nilaiTugas, nilaiUas, nilaiUts, nilaiAkhir;

    
    public Mahasiswa(String nama, String npm, double nilaiTugas, double nilaiUas, double nilaiUts) {
        this.nama = nama;
        this.npm = npm;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
        this.nilaiUts = nilaiUts;
    }
    public void printData(String jurusan){
        System.out.println("NPM\t: " + this.npm);
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Jurusan\t: " + jurusan);
        hitungNA(nilaiTugas, nilaiUts, nilaiUas);
        System.out.println("Nilai Akhir\t: " + this.nilaiAkhir);
    }
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nilaiAkhir = ((nilaiTugas*.3)+(nilaiUts*.35)+(nilaiUas*.35));
    }
    public void hitungNA(String msg){
        System.out.println("Nilai Tidak Valid");
    }

}

public class Shalahuddin_Praktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Segiempat se = new Segiempat();
        // System.out.println(se.luas(8));
        Mahasiswa mhs = new Mahasiswa("Test1", "1235", 80, 80, 90);
        mhs.printData("Ilkom");
        
        

        
    }
    
}
