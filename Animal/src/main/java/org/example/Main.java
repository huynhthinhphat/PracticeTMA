package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Tomcat(5, "Abc"),
                new Frog(3, "Jony", "male"),
                new Kitten(8, "Barron"),
                new Dog(5, "Marry", "male")
        };

        System.out.println("Tổng tuổi trung bình: " + Animal.sumAverageAge(animals));

        for(Animal animal : animals){
            System.out.print(animal.getName() + " kêu ");
            animal.makeSound();
        }
    }
}