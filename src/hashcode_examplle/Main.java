package hashcode_examplle;

import hashcode_examplle.Employee;

public class Main {
    public static void main(String[] args) {
     Employee employee1= new Employee();
     Employee employee2= new Employee();


     employee2.setId(56);
     employee2.setName("rahul");

     employee1.setName("rahul");
     employee1.setId(56);
//
//        System.out.println(employee2==employee1);
//        System.out.println(employee2.equals(employee1));
//        System.out.println(employee1.equals(employee2));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee2.getId().hashCode());
        System.out.println(employee1.getId().hashCode());
        System.out.println(employee2.equals(employee1));


        System.out.println(employee1.getName().hashCode());

        System.out.println(employee2.getName().hashCode());



    }
}
