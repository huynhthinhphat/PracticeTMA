package org.example.model;

public class Kitten extends Cat{

    public Kitten(int age, String name) {
        super(age, name, "female");
    }

    @Override
    public void makeSound(){
        System.out.println("Meo Meo (Kitten)");
    }
}
