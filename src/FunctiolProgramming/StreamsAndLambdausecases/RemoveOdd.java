package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveOdd {
    //Given a list of integers, write a Java program to remove all the odd numbers from the list using streams and lambdas.
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(55,62,66,99,78,100,12));
         l.stream().filter(x->x%2!=0).forEach(System.out::println);
    }

}
