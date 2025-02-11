package org.example;

public class Frog extends Animal{

    public Frog(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void makeSound(){
        System.out.println("Ộp ộp");
    }
}
