public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age == o.age || this.age < o.age)
            return 0;
        else if(this.age > o.age)
            return 1;
        return 0;
    }
}
