package FunctiolProgramming.Behaviour_Parameterization;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example_1 {
    public static void main(String[] args) {
        List<Integer> list= List.of(12,9,13,45,63,75);
        List<Integer> l = list.stream().map(mappingFunction()).collect(getIntegerListCollector());
    }

    private static Collector<Integer, ?, List<Integer>> getIntegerListCollector() {
        return Collectors.toList();
    }

    private static Function<Integer, Integer> mappingFunction() {
        return x -> x * x;
    }


}
