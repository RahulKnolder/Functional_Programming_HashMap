package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class uppercase {

//Write a Java program to convert a list of strings to uppercase using streams and lambda expressions.

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("rahul","sinha","is","avery","good","boy"));

        List<String> r=l.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println(r);
    }
}
