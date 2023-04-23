package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpecificCharacter {
//    Given a list of strings, write a Java program to filter out
//    all strings that contain a specific character using streams and lambda expressions.


    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("rahul","sinha","is","avery","good","boy"));

        List<String> l2= l.stream().filter(str->str.contains("a")).collect(Collectors.toList());
        System.out.println(l2);
    }
}
