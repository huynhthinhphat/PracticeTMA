package org.example.service;

import org.example.model.Animal;

public class AgeService {
    //Tính tuổi trung bình của danh sách Animal
    public static double sumAverageAge(Animal[] animals){
        int totalAge = 0;
        for(int i = 0; i < animals.length; i++){
            totalAge += animals[i].getAge();
        }

        return (double) totalAge / animals.length;
    }
}
