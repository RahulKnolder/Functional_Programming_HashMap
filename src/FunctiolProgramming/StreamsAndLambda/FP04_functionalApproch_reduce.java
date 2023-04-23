package FunctiolProgramming.StreamsAndLambda;

import java.util.List;

//even number example
public class FP04_functionalApproch_reduce {

    private static void print(int numbers) {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        System.out.println( FP04_functionalApproch_reduce.sumOFNumber(List.of(5, 6, 8, 9, 2, 3, 10)));
        System.out.println("------------------------------------------------------------------------");
        System.out.println( FP04_functionalApproch_reduce.sumOFcubes(List.of(1, 2, 3, 4, 5, 6, 7)));

    }

    private static Integer sum(Integer aggrigate , Integer nextnumber) {
        System.out.println(aggrigate+"   "+nextnumber);   //aggregation function
       return aggrigate+nextnumber;
    }


    private static Integer sumOFNumber(List<Integer> str) {
       return str.stream().//conver to streams
                             reduce(0,FP04_functionalApproch_reduce::sum);//reduce methode takes an initioal value and method refrence

//        return str.stream().//conver to streams
//                                    reduce(0,(x,y)->x+y);we can also use it in lambda function o do the following

//        return str.stream().//conver to streams
//                                    reduce(0,Integer::sum);//inbuilt method to do so

        /*
        * Performs a reduction on the elements of this stream, using an associative accumulation function, and returns
        *an Optional describing the reduced value, if any. This is equivalent to:
        */
    }

    private static Integer sumOFcubes(List<Integer> str) {
//        return str.stream().//conver to streams
//                                    reduce(0,(x,y)->x*x+y*y);//inbuilt method to do so


//        return str.stream().map(x->x*x).reduce(0,Integer::sum); // square of the intgegers
//        return str.stream().map(x->x*x*x).reduce(0,Integer::sum); // square of the intgegers
        return str.stream().filter(x->x%2==0).reduce(0,Integer::sum); // sum of the even numbers


    }


}
