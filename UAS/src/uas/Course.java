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
public class Course {
    private String courseName;
    private Profesor profesor;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public Course(String courseName, String profName) {
        this.courseName = courseName;
        this.profesor = new Profesor(profName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
}
