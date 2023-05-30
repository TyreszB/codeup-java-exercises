package grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();



    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(double grade : grades ){
            sum += grade;
        }
        double average = sum / grades.size();
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

}
