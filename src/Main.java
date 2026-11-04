import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Ivan", "Anna", "Peter", "Mary");

        System.out.println("Task 1: " + Task1.getOddIndexNames(names));
        System.out.println("Task 1 (empty): '" + Task1.getOddIndexNames(List.of()) + "'");

        List<String> words = List.of("apple", "pear", "banana", "orange");
        System.out.println("Task 2: " + Task2.sortDescendingUppercase(words));
        System.out.println("Task 2 (empty): " + Task2.sortDescendingUppercase(List.of()));

        String[] numbers = {"1, 2, 0", "4, 5"};
        System.out.println("Task 3: " + Task3.sortNumbers(numbers));
        System.out.println("Task 3 (empty): '" + Task3.sortNumbers(new String[0]) + "'");
    }
}
