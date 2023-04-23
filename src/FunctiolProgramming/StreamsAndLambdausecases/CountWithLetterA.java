package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountWithLetterA {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("rahul","sinha","is","avery","good","boy"));

      List<String> l2=  l.stream().filter(s->s.contains("a")).collect(Collectors.toList());
        System.out.println(l2);
    }

}
