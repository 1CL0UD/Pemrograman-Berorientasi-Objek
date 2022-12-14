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
public class PartTimeStudent extends Student{
    private int duration;
    private Student name;

    public PartTimeStudent(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
