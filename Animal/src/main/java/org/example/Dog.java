package org.example;

public class Dog extends Animal{

    public Dog(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void makeSound(){
        System.out.println("Gâu gâu");
    }
}
