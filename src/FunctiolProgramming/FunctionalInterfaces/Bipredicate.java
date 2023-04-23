package FunctiolProgramming.FunctionalInterfaces;

import java.util.function.BiPredicate;

public class Bipredicate {
    public static void main(String[] args) {


        BiPredicate<Integer,String> biPredicate= (number,word)->{
                return number<10 && word.length()>5;
        };

        boolean i= biPredicate.test(5,"rahul");
        System.out.println(i);

    }


}
