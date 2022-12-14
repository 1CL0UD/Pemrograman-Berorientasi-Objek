/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import static java.lang.Math.abs;

/**
 *
 * @author Praktikan
 */
public class UAS {

    public static void kucingDanTikus(int x, int y, int z){
        int ac = z-x;
        int bc = z-y;
        if(Math.abs(ac)<Math.abs(bc)){
            System.out.println("Cat A");
        }else if(Math.abs(ac)>Math.abs(bc)){
            System.out.println("Cat B");
        }else if(Math.abs(ac)==Math.abs(bc)){
            System.out.println("Mouse C");
        }
    }
    public static void main(String[] args) {
//        kucingDanTikus(2,4,7);
        
//        Titik A = new Titik(0,0);
//        Titik B = new Titik(3,0);
//        Titik C = new Titik(0,4);
//        
//        SegiTiga s = new SegiTiga();
//        s.setA(A);
//        s.setB(B);
//        s.setC(C);
//        
//        System.out.println(s.keliling());
        
        
        Profesor p=new Profesor("Didik");
        Course c = new Course("PBO");
        c.setProfesor(p);
        PartTimeStudent ps = new PartTimeStudent("Rika",6);
//        ps.enrol(c);
        ps.enrol(new Course("Basis Data","Yohana"));
        ps.printCourses(); 
//        System.out.println(c.getCourseName());
//        System.out.println(c.getProfesor());
        
    }
    
}
