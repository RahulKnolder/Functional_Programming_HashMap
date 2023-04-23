package FunctiolProgramming.StreamsAndLambda.MoreFunctanaolities;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class InputStreamExample {
    public static void main(String[] args) {

        //printing 1 to 9
        IntStream.range(1,10).forEach(System.out::println);


        System.out.println("--------------------------------");
        //printing 1 to 10
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        System.out.println("--------------------------------");
        //printing sum to 1 to 10
        System.out.println(IntStream.rangeClosed(1, 10).sum());


        System.out.println("--------------------------------");
        //printing first 10 odd numbers number
         IntStream.iterate(1,i->i+2).limit(10).peek(System.out::println).sum();



        System.out.println("-----------------first 10 even numbers---------------");
         //first 10 even numbers
        IntStream.iterate(2,i->i+2).limit(10).peek(System.out::println).sum();



        //note we cammot apply a collect operation on a premitive datatype so we use boxed()for this

    }
}
