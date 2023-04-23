package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringLLengthMApping {
    public static void main(String[] args) {

        /*Given a list of strings, write a program to return a new list containing the length of each string.*/
        List<String> l = new ArrayList<>(List.of("rahul","sinha","is","avery","good","boy"));

        List<Integer> l2=l.stream().map(str->str.length()).collect(Collectors.toList());
        System.out.println(l2);
    }
}
