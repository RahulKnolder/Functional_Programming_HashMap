package hashset.set1;

import java.util.HashSet;

public class hasSet {
    public static void main(String[] args) {
        HashSet<people> hash = new HashSet<people>();
        hash.add(new people(56,"rahul"));
        hash.add(new people(6,"rahul"));
        hash.add(new people(56,"rahul"));
        hash.add(new people(56,"rahul"));


        for (people p:hash) {
            System.out.print(p.age);
            System.out.print(p.name);
            System.out.println();
        }


        /*In this example, we have a Person class that has two fields: name and age. The hashCode method generates a
        hash code based on the name and age fields using the Objects.hash method. The equals method compares the name
        and age fields of two Person objects to determine if they are equal using the Objects.equals method.
        If two Person objects have the same name and age fields, their hashCode method will generate the same hash code,
         and according to the hash code and equals contract, they should also be considered equal when compared using the
          equals method.*/

    }
}
