package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ascending {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(55,62,66,65,78,65,12));
        List<Integer> l2= l.stream().sorted(Comparator.naturalOrder())
                                  .toList();
        System.out.println(l2);
    }
}
