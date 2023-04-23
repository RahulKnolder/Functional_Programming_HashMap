package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;

public class AverageOFNumbers {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(55,62,66,99,78,100,12));

        /*Given a list of integers, write a Java program to find the average of all the numbers in the list using streams and lambdas.*/


        System.out.println(( l.stream().reduce(Integer::sum).get())/l.size());
    }
}
