package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class maximum_value {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(List.of(55,62,66,65,78,65,12));
       int a= l.stream().reduce(Integer::max).get();

        System.out.println(a);
    }

}
