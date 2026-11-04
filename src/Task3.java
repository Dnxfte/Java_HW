import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String sortNumbers(String[] input) {
        return Arrays.stream(input)
                .flatMap(line -> Arrays.stream(line.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
