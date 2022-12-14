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
public class Titik {
    private int x;
    private int y;
    
    public Titik(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    double jarak(Titik o){
        double dist = 0;
        dist = Math.sqrt((Math.pow((this.x-o.x), 2)+Math.pow((this.y-o.y),2)));
        return dist;
    }
    
    double distance(Titik o){
        double dist = 0;
        dist = Math.sqrt((Math.pow((this.x-o.x), 2)+Math.pow((this.y-o.y),2)));
        return dist;
    }
}
