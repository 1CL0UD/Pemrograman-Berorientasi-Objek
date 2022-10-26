/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum9_shalahuddin;

/**
 *
 * @author Praktikan
 */

// class Tabung{
//     private final static double pi = Math.PI;
//     public static double volume(double r, double t){
//         double vol = pi*r*r*t;
//         return vol;
//     }
//     public static double luasPerm(double r, double t){
//         double luasPerm = (2*pi*r*(r+t));
//         return luasPerm;
//     }
// }
public class static_class {

    public static class Tabung{
        private final static double pi = Math.PI;
        public static double volume(double r, double t){
            double vol = pi*r*r*t;
            return vol;
        }
        public static double luasPerm(double r, double t){
            double luasPerm = (2*pi*r*(r+t));
            return luasPerm;
        }
    }
    public static void main(String[] args){
           
        System.out.println(Tabung.volume(7, 7));
        System.out.println(Tabung.luasPerm(7, 7));
               
        
    }
    
}
