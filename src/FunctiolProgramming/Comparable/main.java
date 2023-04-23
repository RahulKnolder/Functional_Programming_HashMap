package FunctiolProgramming.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {



    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(new Student(12,"rahul"),

                new Student(11,"sinha"),
                new Student(11,"riya")
        ));
        Collections.sort(list);

       list.stream().forEach(System.out::println);
    }
}
