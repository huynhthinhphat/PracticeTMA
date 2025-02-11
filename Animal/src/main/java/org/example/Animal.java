package org.example;

abstract class Animal implements Sound{
    private int age;
    private String name;
    private String sex;

    public Animal(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public void makeSound(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static double sumAverageAge(Animal[] animals){
        int totalAge = 0;
        for(int i = 0; i < animals.length; i++){
            totalAge += animals[i].getAge();
        }

        return (double) totalAge / animals.length;
    }
}
