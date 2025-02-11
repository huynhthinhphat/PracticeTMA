package org.example;

public class Cat extends Animal{

    public Cat(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void makeSound(){
        System.out.println("Meo Meo");
    }
}
