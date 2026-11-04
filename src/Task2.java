import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static List<String> sortDescendingUppercase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
