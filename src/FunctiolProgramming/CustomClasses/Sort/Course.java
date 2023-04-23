package FunctiolProgramming.CustomClasses.Sort;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Course {
    private String name;
    private Integer score;
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

    public void setScore() {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    };



    private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
        return course -> course.getScore() > cutoffReviewScore;
    }

    public static void main(String[] args) {
        List<Course> l = List.of(new Course("rahul", 56, 1),
                new Course("bablu", 51, 2),
                new Course("Aabha", 53, 3),
                new Course("sinha", 53, 4),
                new Course("Rishika", 588, 5)
        );



              //sort according to Score
        List<Course> l2 = l.stream().sorted(Comparator.comparing(Course::getScore)).collect(Collectors.toList());

        //sort according to Score seversed
        List<Course> l3 = l.stream().sorted(Comparator.comparing(Course::getScore).reversed()).collect(Collectors.toList());

        //sort according to course and then name
        List<Course>l4 = l.stream().sorted(Comparator.comparing(Course::getScore).thenComparing(Course::getName)).collect(Collectors.toList());




        l2.stream().forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        l3.stream().forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        l4.stream().forEach(System.out::println);
        System.out.println("--------------------limit-----------------------------");


        //limit
        l.stream().limit(3).forEach(System.out::println);
        System.out.println("-------------------skip--------------------------");

        //skip
        l.stream().skip(2).forEach(System.out::println);
        System.out.println("--------------------predicate mehode definced explixitly-----------------------------");

        //sort on the basis of the Predicate score defined above using static keyword
        Predicate<Course> reviewScoreGreaterThan95Predicate2
                = createPredicateWithCutoffReviewScore(56);
        l.stream().filter(reviewScoreGreaterThan95Predicate2).forEach(System.out::println);


        System.out.println("--------------------predicate mehode definced explixitly-----------------------------");
        Predicate<Course> reviewScoreGreaterThan95Predicate
                = createPredicateWithCutoffReviewScore(0);
        l.stream().filter(reviewScoreGreaterThan95Predicate).forEach(System.out::println);


        System.out.println("--------------------take while-----------------------------");
        l.stream().takeWhile(course->course.getScore()>50).forEach(System.out::println);


        System.out.println("--------------------drop while-----------------------------");
        l.stream().dropWhile(course->course.getScore()>60).forEach(System.out::println);


        System.out.println("--------------------max-----------------------------");
        System.out.println(l.stream().max(Comparator.comparing(Course::getScore)));


        System.out.println("--------------------findany-----------------------------");
        System.out.println(l.stream().findAny().filter(course -> course.getScore() > 50));


        System.out.println("--------------------Average-----------------------------");
        System.out.println(l.stream().mapToInt(Course::getScore).average());

        System.out.println("--------------------counting-----------------------------");
        System.out.println(l.stream().map(Course::getScore).filter(integer -> integer > 60).count());

        System.out.println("--------------------group by-----------------------------");
        System.out.println(l.stream().collect(Collectors.groupingBy(Course::getName)));

        System.out.println("--------------------group by count-----------------------------");
        System.out.println(l.stream().collect(Collectors.groupingBy(Course::getName,Collectors.counting())));






    }




}
