import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** INSTRUCTION EXAMPLE
 * [] --> []
 * ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }

    public static List<String> number(List<String> lines) {
        List<String> lists = new ArrayList<>();
        int j = 1;
        for (String line : lines) {
            lists.add(j++ + ": " + line);
        }
        return lists;
    }
}
