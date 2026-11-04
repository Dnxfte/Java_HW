import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Ivan", "Anna", "Peter", "Mary");

        System.out.println("Task 1: " + Task1.getOddIndexNames(names));
        System.out.println("Task 1 (empty): '" + Task1.getOddIndexNames(List.of()) + "'");
    }
}
