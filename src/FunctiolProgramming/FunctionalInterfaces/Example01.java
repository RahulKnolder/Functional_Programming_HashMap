package FunctiolProgramming.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 8, 9, 56);
//        Predicate<Integer> integerPredicate_1 = x -> x % 2 == 0;


        /*Represents a predicate (boolean-valued function) of one argument.
         This is a functional interface whose functional method is test(Object).
             Since:
              1.8
          Type parameters:
         <T> – the type of the input to the predicate*/

        Predicate<Integer> integerPredicate_1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };



/*
* Represents a function that accepts one argument and produces a result.
This is a functional interface whose functional method is apply(Object).
Since:
1.8
Type parameters:
<T> – the type of the input to the function <R> – the type of the result of the function
 */




        Function<Integer, Integer> iSquaredFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        //predicate is basically used to  test something

        Consumer<Integer> println = System.out::println;
        list.stream().
                filter(integerPredicate_1).
                map(iSquaredFunction).
                forEach(println);
    }
}
