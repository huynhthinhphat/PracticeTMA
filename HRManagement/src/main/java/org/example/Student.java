package org.example;

public class Student extends Human{
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "First Name: " + getFirstName() + " - Last Name: " + getLastName() + " - Grade: " + grade;
    }
}