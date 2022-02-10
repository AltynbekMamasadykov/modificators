package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	/*
	Студент деген класс тузунуз.Студенттин туулган куну,аты,фамилиясы жана электрондук почтасы болсун.
	Группа деген класс тузуу. Группада студенттердин массиви,группа эмнени окушу жана группа окуп баштаган дата болсун.
	Курс деген класс тузунуз.Кустун аты,номери,мугалимдин аты жону жана группалардын массиви болушу керек.
	Баардык класстарга конструкторлорду тузуу жана по умолчанию конструктордуда тузуу.
	Геттер сеттерлер аркылуу маани берип жана алуу керек.Студенттин жашын терс эмес сан экенин текшеруу керек.
	(текшеруу сеттерде жана конструктордо жазылат)
	 */

     Student student1 = new Student("aza","aza@gmail.com", 15);
     Student student2 = new Student("braza","braza@gmail.com",20);
     System.out.println(student1.toString());
     System.out.println(student2.toString());
     Student[] grup1 = {student1,student2};

     Student student3 = new Student("ali","ali@gmail.com", -18);
     Student student4 = new Student("bali","bali@gmail.com", 19);
     System.out.println(student3.toString());
     System.out.println(student4.toString());
     Student[] grup2 = {student3,student4};


     Group group1 = new Group(grup1,"backend",LocalDate.of(2022,1,4));
     Group group2 = new Group(grup2,"backend",LocalDate.of(2021,9,4));
     System.out.println(group1.toString());
     System.out.println(group2.toString());


     Group[] groups = {group1,group2};

     Course course = new Course("java",5,"john doe",groups);
     System.out.println(course.toString());






    }
}
