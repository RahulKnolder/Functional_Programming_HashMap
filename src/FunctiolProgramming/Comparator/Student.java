package FunctiolProgramming.Comparator;

import java.util.Comparator;

public class Student{


    int roll;
    String name ;


    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }


    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                       "roll=" + roll +
                       ", name='" + name + '\'' +
                       '}';
    }

    public String getName() {
        return name;
    }



}
