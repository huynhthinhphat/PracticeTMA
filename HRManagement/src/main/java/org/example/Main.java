package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("Nguyen Van", "A", 1);
        Student student2 = new Student("Anh", "Pham", 4);
        Student student3 = new Student("Huynh", "Phat", 3);
        Student student4 = new Student("Le Duong", "Bao Lam", 9);
        Student student5 = new Student("Huynh", "Hung", 5);
        Student student6 = new Student("Son", "Tung", 8);
        Student student7 = new Student("Phuong", "Tuan", 7);
        Student student8 = new Student("Nhat", "Nam", 8);
        Student student9 = new Student("Huynh", "Phat", 2);
        Student student10 = new Student("Thinh", "Tai", 7);

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        listStudent.add(student6);
        listStudent.add(student7);
        listStudent.add(student8);
        listStudent.add(student9);
        listStudent.add(student10);

        listStudent.sort(Comparator.comparingInt(Student::getGrade));
        for(Student student : listStudent){
            System.out.println("First Name: " + student.getFirstName() + " - Last Name: " + student.getLastName() + " - Grade: " + student.getGrade());
        }

        System.out.println();

        List<Worker> listWorker = new ArrayList<>();
        Worker worker1 = new Worker("Thinh", "Phat", 10, 5);
        Worker worker2 = new Worker("Thinh", "Tai", 7, 3);
        Worker worker3 = new Worker("Thanh", "Tam", 15, 2);
        Worker worker4 = new Worker("Quang", "Hieu", 25, 10);
        Worker worker5 = new Worker("Ka", "Ren", 10, 3);
        Worker worker6 = new Worker("Quang", "Khai", 5, 8);
        Worker worker7 = new Worker("Minh", "Duc", 10, 5);
        Worker worker8 = new Worker("Hong", "Ha", 8, 5);
        Worker worker9 = new Worker("Hong", "Hai", 3, 2);
        Worker worker10 = new Worker("Thinh", "Phat", 10, 1);

        listWorker.add(worker1);
        listWorker.add(worker2);
        listWorker.add(worker3);
        listWorker.add(worker4);
        listWorker.add(worker5);
        listWorker.add(worker6);
        listWorker.add(worker7);
        listWorker.add(worker8);
        listWorker.add(worker9);
        listWorker.add(worker10);

        listWorker.sort(Comparator.comparingDouble(Worker::moneyPerHour).reversed());
        for(Worker worker : listWorker){
            System.out.println("First Name: " + worker.getFirstName() + " - Last Name: " + worker.getLastName() + " - Money per hours: " + String.format("%.1f",worker.moneyPerHour()));
        }

        System.out.println();

        List<Human> mergeList = new ArrayList<>();
        mergeList.addAll(listStudent);
        mergeList.addAll(listWorker);

        mergeList.sort(Comparator.comparing(Human::getFirstName).thenComparing(Human::getLastName));
        for(Object obj : mergeList){
            System.out.println(obj);
        }
    }
}
