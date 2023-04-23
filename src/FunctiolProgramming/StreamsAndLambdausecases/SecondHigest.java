package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHigest {
    public static void main(String[] args) {
        List<Integer> l = List.of(55,62,66,99,78,100,12);
        Integer i =l.stream().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(i);
    }
}
