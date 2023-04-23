package FunctiolProgramming.FunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctional {
    public static void main(String[] args) {
        BiFunction<Integer,String ,String> biFunction=(number,str)->{
            return number+" "+str;
        };

        String bi= biFunction.apply(5,"rahul");
        System.out.println(bi);

    }
}
