package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class customObjects {
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public customObjects(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    String gender;


    @Override
    public String toString() {
        return "customObjects{" +
                       "id=" + id +
                       ", name='" + name + '\'' +
                       ", gender='" + gender + '\'' +
                       '}';
    }

    static    List<customObjects> i = new ArrayList<>(List.of(new customObjects(5,"rahul","f"),
            new customObjects(8,"riys","f"),
            new customObjects(1,"sneha","f")

    ));



   static List<customObjects> l2= i.stream().sorted(Comparator.comparing(customObjects::getId)).collect(Collectors.toList());

    public static void main(String[] args) {
        System.out.println(customObjects.l2);
    }
}
