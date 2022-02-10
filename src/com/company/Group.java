package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Student[] students;
    private String course;
    private LocalDate groupStartDate;

    public Group(){
        //default constructor
    }

    public  Group(Student[] students,String course,LocalDate groupStartDate){
        this.students = students;
        this.course = course;
        this.groupStartDate = groupStartDate;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getGroupStartDate() {
        return groupStartDate;
    }

    public void setGroupStartDate(LocalDate groupStartDate) {
        this.groupStartDate = groupStartDate;
    }

    public void groupInfo(){
        System.out.println(Arrays.toString(getStudents()) +" "+getCourse()+" "+getGroupStartDate());
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", course='" + course + '\'' +
                ", groupStartDate=" + groupStartDate +
                '}';
    }
}
