package FunctiolProgramming.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = List.of(new Student(12, "raahul"),
                new Student(16, "sinha"),
                new Student(12, "riya"),
                new Student(14, "sneha"));
        List<Student> list2= new ArrayList<>(list);

        Collections.sort(list2,new RollComare());


        list2.stream().forEach(System.out::println);
    }
}

