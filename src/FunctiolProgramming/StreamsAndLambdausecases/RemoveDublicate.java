package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicate {
    //Write a Java program to remove all duplicate elements from a list of integers using streams and lambda expressions.
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(55,62,66,66,66,66,65,78,65,12));
        List<Integer> l2= l.stream().distinct().collect(Collectors.toList());
        System.out.println(l2);
    }
}
