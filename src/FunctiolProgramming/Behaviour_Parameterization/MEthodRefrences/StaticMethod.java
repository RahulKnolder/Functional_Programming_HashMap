package FunctiolProgramming.Behaviour_Parameterization.MEthodRefrences;

import java.security.PublicKey;
import java.util.List;

public class StaticMethod {

    public static void print(Integer i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        List<Integer> l = List.of(1,5,6,5,3);

        l.stream().map(x->x*x).forEach(StaticMethod::print);
    }
}
