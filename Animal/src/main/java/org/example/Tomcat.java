package org.example;

public class Tomcat extends Cat{

    public Tomcat(int age, String name) {
        super(age, name, "male");
    }

    @Override
    public void makeSound(){
        System.out.println("Meo Meo (Tomcat)");
    }
}
