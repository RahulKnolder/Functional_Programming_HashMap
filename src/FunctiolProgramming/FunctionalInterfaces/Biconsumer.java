package FunctiolProgramming.FunctionalInterfaces;

import java.util.function.BiConsumer;

public class Biconsumer {
    public static void main(String[] args) {
        BiConsumer<String,String> ll =(str1,str2)->{
            System.out.println(str1.length()+str2.length());
        };
        ll.accept("rahul","ayush");
    }
}
