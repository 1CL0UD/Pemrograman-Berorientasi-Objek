/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Student implements StudentInterface{
    private String name;
    ArrayList<Course> courses = new ArrayList<>();

    public boolean addCourse(Course newCourse){
        courses.add(newCourse);
        return true;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void enrol(Course c){
        courses.add(c);
        c.setCourseName(c.getCourseName());
    }
    
    public void printCourses(){
        for (Course x : courses) {
            System.out.println(x.getCourseName() + ": " + x.getProfesor().getName());
            
        }
    }
    
    @Override
    public void takeExam(){
        System.out.println("Take course exam");
    }
}
