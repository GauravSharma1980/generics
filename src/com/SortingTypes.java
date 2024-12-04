package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class Person
{
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
public class SortingTypes {

    public static void main(String[] args) {

        System.out.println("sorting as per the natural order..........");
        List<String> names = Arrays.asList("Gaurav","Saurav","Kapil","Aasha");
        names.sort(String::compareTo);
        System.out.println(names);

        System.out.println("sorting as per the custom order...........");
        names.sort((s1,s2) -> s2.compareTo(s1));
        System.out.println(names);

        System.out.println("sorting by applying sort on the stream of objects");
        List<String> collect = names.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("sorting using custom operations...");
        collect = names.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("Sorting by Object Fields");

        List<Person> personList = Arrays.asList(
                new Person("gaurav", "23"),
                new Person("saurav", "14"),
                new Person("aarav", "30"),
                new Person("gautam", "12"));


        List<Person> sortedPersonList = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        sortedPersonList.forEach(person ->System.out.println(person.getName()+"**"+person.getAge()));
    }
}
