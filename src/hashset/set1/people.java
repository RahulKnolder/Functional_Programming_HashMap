package hashset.set1;

import java.util.Objects;

public class people {
    int age ;
    String name ;

    public people(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        people people = (people) o;
        return age == people.age && name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
