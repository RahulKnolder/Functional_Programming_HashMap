package FunctiolProgramming.StreamsAndLambda;

import java.util.List;

//even number example
public class FP02_functionalApproch {

    private static void print(int numbers) {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        FP02_functionalApproch.printEvenNumbers(List.of(5, 6, 8, 9, 65, 5, 8900));

        //second function using condition in filter method

        System.out.println("----------------------------------------------------------------------------------------------");
        FP02_functionalApproch.printEvenNumbers_2(List.of(5, 6, 8, 9, 65, 5, 8900));
        System.out.println("----------------------------------------------------------------------------------------------");
        FP02_functionalApproch.printODdNUmbers(List.of(5, 6, 8, 9, 65, 5, 8900));
        System.out.println("----------------------------------------------------------------------------------------------");
        FP02_functionalApproch.printSpring(List.of("springs", "rahul", "string", "streams"));
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    //isEven function
    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    //using a method refrence (isEven) in streams to  prunt the even number
    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(FP02_functionalApproch::isEven).forEach(System.out::println);

        // :: this is a method refrence in function programming
        //is are not basically calling the it is reffering the function in the class
        // Streams basically does is to create a stream of number and individually we can perform  operations in it

        // we can write direct prinlt function in the line of stream so to avoide print function
        //code below

    }


    // pass the the condition then and there in the filter  method
    private static void printEvenNumbers_2(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void printODdNUmbers(List<Integer> numbers){
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }

    private static void printSpring(List<String> list){
        list.stream().filter(str->str.equals("streams")).forEach(System.out::println);
    }
}
