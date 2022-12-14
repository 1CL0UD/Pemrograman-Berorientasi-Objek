/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Praktikan
 */
public class SegiTiga {
    private Titik A;
    private Titik B;
    private Titik C;

    public Titik getA() {
        return A;
    }

    public void setA(Titik A) {
        this.A = A;
    }

    public Titik getB() {
        return B;
    }

    public void setB(Titik B) {
        this.B = B;
    }

    public Titik getC() {
        return C;
    }

    public void setC(Titik C) {
        this.C = C;
    }
    
    public double keliling(){
        return A.distance(B)+B.distance(C)+C.distance(A);
    }
        
}
