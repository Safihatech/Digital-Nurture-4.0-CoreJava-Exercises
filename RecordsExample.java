import java.util.*;
import java.util.stream.Collectors;

// Define a record
record Person(String name, int age) {}

public class Records {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 17),
            new Person("Charlie", 25)
        );

        System.out.println("All Persons:");
        people.forEach(System.out::println);

        System.out.println("\nPeople aged 18 and above:");
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        adults.forEach(System.out::println);
    }
}

/*output:
All Persons:
Person[name=Alice, age=22]
Person[name=Bob, age=17]
Person[name=Charlie, age=25]

People aged 18 and above:
Person[name=Alice, age=22]
Person[name=Charlie, age=25]*/
