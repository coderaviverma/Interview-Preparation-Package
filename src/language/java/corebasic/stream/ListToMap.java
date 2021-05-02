package language.java.corebasic.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    // id will act as Key
    private Integer id;

    // name will act as value
    private String name;

    // create curstuctor for reference
    public Student(Integer id, String name)
    {

        // assign the value of id and name
        this.id = id;
        this.name = name;
    }

    // return private variable id
    public Integer getId()
    {
        return id;
    }

    // return private variable name
    public String getName()
    {
        return name;
    }
}

public class ListToMap {

    public static void main(String[] args) {

        // create a list
        List<Student> lt = new ArrayList<>();

        // add the member of list
        lt.add(new Student(1, "Geeks"));
        lt.add(new Student(2, "For"));
        lt.add(new Student(3, "Geeks"));

        // create map with the help of
        // Collectors.toMap() method
        LinkedHashMap<Integer, String>
                map = lt.stream()
                .collect(
                        Collectors
                                .toMap(
                                        Student::getId,
                                        Student::getName,
                                        (x, y)
                                                -> x + ", " + y,
                                        LinkedHashMap::new));

        // print map
        map.forEach(
                (x, y) -> System.out.println(x + "=" + y));
    }
}
