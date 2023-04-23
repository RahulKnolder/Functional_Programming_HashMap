package FunctiolProgramming.StreamsAndLambdausecases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EMployeeHighestsalary {
    String name;
    Integer id;
    String desiganation;

    @Override
    public String toString() {
        return "EMployeeHighestsalary{" +
                       "name='" + name + '\'' +
                       ", id=" + id +
                       ", desiganation='" + desiganation + '\'' +
                       '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesiganation() {
        return desiganation;
    }

    public void setDesiganation(String desiganation) {
        this.desiganation = desiganation;
    }

    public EMployeeHighestsalary(String name, Integer id, String desiganation) {
        this.name = name;
        this.id = id;
        this.desiganation = desiganation;
    }

    public static void main(String[] args) {
        List<EMployeeHighestsalary> eMployeeHighestsalaries = new ArrayList<>(List.of(new EMployeeHighestsalary("rahul", 2, "java"),
                new EMployeeHighestsalary("sinha", 6, "tset"),

                new EMployeeHighestsalary("akash", 232, "scala")
        ));

        EMployeeHighestsalary l2 = eMployeeHighestsalaries.stream().max(Comparator.comparing(EMployeeHighestsalary::getId)).get();
        System.out.println(l2);

    }


}
