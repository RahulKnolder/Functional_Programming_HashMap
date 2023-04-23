package FunctiolProgramming.CustomClasses.match;

import java.util.List;

public class Course {
    private String name ;
    private  Integer  score;
    private Integer id;

    public Course(String name, Integer score, Integer id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                       "name='" + name + '\'' +
                       ", score='" + score + '\'' +
                       ", id=" + id +
                       '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public static void main(String[] args) {
        List<Course> l = List.of(new Course("rahul",56,1),
                new Course("Rishika",51,2),
                 new Course("Rishika",53,3),
                new Course("Rishika",54,4),
                new Course("Rishika",588,5)

                );



             boolean i=    l.stream().allMatch(course -> course.getId()<60);
             boolean j=    l.stream().anyMatch(course -> course.getId()>60);
             boolean k=    l.stream().noneMatch(course -> course.getId()>60);
             System.out.println(i);
             System.out.println(j);
             System.out.println(k);
    }
}
