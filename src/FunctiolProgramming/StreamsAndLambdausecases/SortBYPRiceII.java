package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.List;

public class SortBYPRiceII {
    Integer price;

    public SortBYPRiceII(Integer price, String productName) {
        this.price = price;
        ProductName = productName;
    }

    String ProductName;

    public Integer getPrice() {
        return price;
    }

    public String getProductName() {
        return ProductName;
    }
    /*Given a list of objects with a "price" field, write a Java program to find the total price of all the objects in the list using streams and lambdas.*/
    public static void main(String[] args) {
        List<SortBYPRiceII> l = new ArrayList<>(List.of(new SortBYPRiceII(56, "salt"),

                new SortBYPRiceII(66, "salt1"),
                new SortBYPRiceII(96, "salt2"),
                new SortBYPRiceII(500, "salt3")

        ));


        Integer i = l.stream().map(SortBYPRiceII::getPrice).reduce(0,Integer::sum);
        System.out.println(i);

    }
}
