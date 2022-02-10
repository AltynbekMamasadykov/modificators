package com.company;

import java.util.Arrays;

public class Course {
    private String name;
    private int number;
    private String instructorName;
    private Group[] groups;

    public Course(){
        //default constructor
    }

    public Course(String name,int number,String instructorName,Group[] groups){
        this.name = name;
        this.number = number;
        this.instructorName = instructorName;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void courseInfo(){
        System.out.println(getName()+" "+getNumber()+" "+getInstructorName()+" "+ Arrays.toString(getGroups()));
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", instructorName='" + instructorName + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}

