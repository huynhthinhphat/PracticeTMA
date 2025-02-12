package org.example.service;

import org.example.model.Human;
import org.example.model.Student;
import org.example.model.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SorterService {

    //Sắp xếp danh sách Student tăng dần theo grade
    public static void sortStudentByGrade(List<Student> listStudent){
        listStudent.sort(Comparator.comparingInt(Student::getGrade));
        for(Student student : listStudent){
            System.out.println("First Name: " + student.getFirstName() + " - Last Name: " + student.getLastName() + " - Grade: " + student.getGrade());
        }
    }

    //Sắp xếp danh sách Worker giảm dần theo moneyPerHour
    public static void sortWorkerByMoneyPerHour(List<Worker> listWorker){
        listWorker.sort(Comparator.comparingDouble(Worker::moneyPerHour).reversed());
        for(Worker worker : listWorker){
            System.out.println("First Name: " + worker.getFirstName() + " - Last Name: " + worker.getLastName() + " - Money per hours: " + String.format("%.1f",worker.moneyPerHour()));
        }
    }

    //Hợp nhất 2 danh sách Student và Worker và sắp xếp theo FirstName, LastName
    public static void mergeAndSortByName(List<Student> listStudent, List<Worker> listWorker){
        List<Human> mergeList = new ArrayList<>();
        mergeList.addAll(listStudent);
        mergeList.addAll(listWorker);

        mergeList.sort(Comparator.comparing(Human::getFirstName).thenComparing(Human::getLastName));
        for(Object obj : mergeList){
            System.out.println(obj);
        }
    }
}
