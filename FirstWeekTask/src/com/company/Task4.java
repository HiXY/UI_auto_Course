package com.company;
import java.util.Scanner;

class Task4
{
    public abstract class Person
    {
        protected String name = "", gender = "";
        protected int age = 0;
    }

    class Father extends Person
    {
        String gender = "Male";
    }
    class Mother extends Person
    {
        String gender = "Female";
    }
    class Kid extends Person
    {}

    public static void main(String[] args)
    {
        Task4 programm = new Task4();
        programm.start();

    }
    public void start()
    {
        Father father = new Father();
        Mother mother = new Mother();
        Kid kid_1 = new Kid();
        Kid kid_2 = new Kid();
        Kid kid_3 = new Kid();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter names for father, mother and 3 children");

        father.name = keyboard.next();
        mother.name = keyboard.next();
        kid_1.name = keyboard.next();
        kid_2.name = keyboard.next();
        kid_3.name = keyboard.next();

        System.out.println("Enter gender for 3 children");

        kid_1.gender = keyboard.next();
        kid_2.gender = keyboard.next();
        kid_3.gender = keyboard.next();

        System.out.println("Enter ages of father, mother and 3 children");

        father.age = keyboard.nextInt();
        mother.age = keyboard.nextInt();
        kid_1.age = keyboard.nextInt();
        kid_2.age = keyboard.nextInt();
        kid_3.age = keyboard.nextInt();

        System.out.println("Father: " + father.name + " " + father.age + "\n");
        System.out.println("Mother: " + mother.name + " " + mother.age + "\n");
        System.out.println("Kids: " + kid_1.name + " " + kid_1.age + " " + kid_1.gender + "\n");
        System.out.println(kid_2.name + " " + kid_2.age + " " + kid_2.gender + "\n");
        System.out.println(kid_3.name + " " + kid_3.age + " " + kid_3.gender + "\n");

    }
}
