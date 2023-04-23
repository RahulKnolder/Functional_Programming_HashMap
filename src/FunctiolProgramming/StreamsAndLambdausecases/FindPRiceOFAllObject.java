package FunctiolProgramming.StreamsAndLambdausecases;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class FindPRiceOFAllObject {
    String name ;
    Integer price;

    public FindPRiceOFAllObject(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public static void main(String[] args) {

        List<FindPRiceOFAllObject> L = new ArrayList<>(List.of(
                new FindPRiceOFAllObject("rahul",0),
                new FindPRiceOFAllObject("rahul",2),
                new FindPRiceOFAllObject("rahul",52),
                new FindPRiceOFAllObject("rahul",5))
        );

        /*The map() method is called on the stream to transform each element of the stream into its price value.
         This is done using a method reference FindPRiceOFAllObject::getPrice,
         which is equivalent to writing f -> f.getPrice() using a lambda expression.*/

        Integer I =L.stream().map(FindPRiceOFAllObject::getPrice).reduce(0,Integer::sum);
        System.out.println(I);

    }
}
