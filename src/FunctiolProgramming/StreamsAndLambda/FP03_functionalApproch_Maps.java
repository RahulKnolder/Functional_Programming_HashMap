package FunctiolProgramming.StreamsAndLambda;

import java.util.List;

//even number example
public class FP03_functionalApproch_Maps {

    private static void print(int numbers) {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        FP03_functionalApproch_Maps.printSquare(List.of(5, 6, 8, 9, 2, 3, 10));

        // mappint ot the length of eaach course
        FP03_functionalApproch_Maps.CourseLength(List.of("springs", "rahul", "string", "streams"));

    }

    private static void printSquare(List<Integer> num) {
        num.stream().map(x -> x * x).forEach(System.out::println);
    }


    private static void CourseLength(List<String> str) {
        str.stream().//conver to streams
                             map(s -> s + " " + s.length()).//lambda Expression
                                                                    forEach(System.out::println);//method reference
    }


}
