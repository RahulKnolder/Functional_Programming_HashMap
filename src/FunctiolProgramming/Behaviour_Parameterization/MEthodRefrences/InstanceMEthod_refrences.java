package FunctiolProgramming.Behaviour_Parameterization.MEthodRefrences;

import java.util.List;

public class InstanceMEthod_refrences {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,5,6,5,3);

        System.out.println(l.stream().reduce(Integer::sum));
    }
}
