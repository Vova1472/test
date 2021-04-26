package com.company;

public class Human extends World {
    World year = new World();
    private  int Age = 70;
    public  void Death(int age){
        if (age > 70){
            year.years -= age;
            System.out.println("Years left = " + year.years);
            System.out.println("Human is dead");
        }
    }


    }

