package com.company;

public class Student {
    private String name;
    private String email;
    private int age;

    public Student(){
        //default constructor
    }

    public Student(String name,String email,int age){
        this.name = name;
        this.email = email;
        if(age>0)
        {this.age = age;}
        else {
            System.out.println("oops "+name+"'s age is negative, but don't worry I solved it");
            this.age = Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("oops age negative");
        }

    }

    public void studinfo(){
        System.out.println("student: "+getName()+"email: "+getEmail()+"age: "+getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
