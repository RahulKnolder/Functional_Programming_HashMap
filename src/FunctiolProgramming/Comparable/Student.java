package FunctiolProgramming.Comparable;

public class Student implements Comparable<Student>{


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


    @Override
    public int compareTo(Student o) {
        if(this.getRoll()>o.getRoll()){
            return 1;
        }
        else if (this.getRoll()<o.getRoll()){
        return   this.getName().compareTo(o.getName());
        }
        else {
            return 0;
        }
    }


}
