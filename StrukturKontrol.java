/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturkontrol;

/**
 *
 * @author Praktikan
 */
public class StrukturKontrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        /** if else
         * Pernyataan ini dapat menjalankan suatu fungsi di dalamnya dengan
         * kondisi yang dapat kita seusaikan.
         */
        if(a>b){
            System.out.println("test1");
        }else if(b>a){
            System.out.println("test2");
        }else{
            System.out.println("test3");
        }
        
        /**While
         * Perulangan yang hanya memerlukan kondisi untuk mengeksekusi program
         */
        while(a>b){
            System.out.println("test4");
        }
        /**For
         * Memiliki 3 parameter. Deklarasi variabel iterasi, kondisi eksekusi,
         * dan perubahan nilai variabel iterasi
         */
        for(int i=0; i<a; i++){
            System.out.println("test5");
        }
        /**Do While
         * Mirip dengan while tapi pasti berjalan minimal sekali
         */
        do{
            System.out.println("test6");
        }while(a>b);
    }
    
}
