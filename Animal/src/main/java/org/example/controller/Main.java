package org.example.controller;

import org.example.model.*;
import org.example.service.AgeService;

public class Main {
    public static void main(String[] args) {
        //Tạo danh sách các loài vật
        Animal[] animals = {
                new Tomcat(5, "Abc"),
                new Frog(3, "Jony", "male"),
                new Kitten(8, "Barron"),
                new Dog(5, "Marry", "male")
        };

        //In tuổi trung bình của danh sách Animal
        System.out.println("Tổng tuổi trung bình: " + AgeService.sumAverageAge(animals));

        //Hiển thị thông tin của animal
        for(Animal animal : animals){
            System.out.print(animal.getName() + " kêu ");
            animal.makeSound();
        }
    }
}