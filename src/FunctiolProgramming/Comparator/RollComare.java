package FunctiolProgramming.Comparator;

import java.util.Comparator;

public class RollComare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getRoll(),o2.getRoll());
    }
}
