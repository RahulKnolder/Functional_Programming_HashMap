package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveStringwithVowel {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("rahul","sinha","is","avery","good","boy"));

/*Given a list of strings, write a Java program to remove all the strings that start with a vowel using streams and lambdas.*/
        List<String> l2= l.stream().filter(s -> s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u').collect(Collectors.toList());
        System.out.println(l2);
    }
}
