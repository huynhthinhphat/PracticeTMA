package org.example;

import java.text.Format;

public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName,double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    public double moneyPerHour(){
        return this.weekSalary * (7/this.workHoursPerDay);
    }

    @Override
    public String toString(){
        return "First Name: " + getFirstName() + " - Last Name: " + getLastName() + " - Money Per Hour: " + String.format("%.1f", moneyPerHour());
    }
}
