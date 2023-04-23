package FunctiolProgramming.StreamsAndLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator_in_Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(36);
        list.add(89);
        list.add(525);

        List<String> list2 = new ArrayList<>();
        list2.add("rahul");
        list2.add("sinhashci");
        list2.add("jasleen");
        list2.add("sahils,dbckjbcjkdbc");
        list2.add("riy");

        list.stream().sorted().forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        list2.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        list2.stream().map(x->x.length()).forEach(System.out::println);

    }
}
