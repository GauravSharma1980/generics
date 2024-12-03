import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("one", "two", "three"),
                Arrays.asList("four", "five"),
                Arrays.asList("six", "seven", "one")
        );

        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        flattenedList.forEach(System.out::println); // Print each element
    }
}
