package FunctiolProgramming.StreamsAndLambda;

import java.util.List;

public class FP01_functionalApproch {

    private static void print(int numbers) {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        listOfIntergers(List.of(5, 6, 8, 9, 65, 5, 8900));
    }

    private static void listOfIntergers(List<Integer> numbers) {
        numbers.stream().forEach(FP01_functionalApproch::print);
        // :: this is a method refrence in function programming
        // Streams basically does is to create a stream of number and individually we can perform  operations in it

        // we can write direct prinlt function in the line of stream so to avoide print function
        //code below
        numbers.stream().forEach(System.out::println);

    }


    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().forEach(FP01_functionalApproch::print);

        // :: this is a method refrence in function programming
        //is are not basically calling the it is reffering the function in the class
        // Streams basically does is to create a stream of number and individually we can perform  operations in it

        // we can write direct prinlt function in the line of stream so to avoide print function
        //code below
        numbers.stream().forEach(System.out::println);

    }
}
