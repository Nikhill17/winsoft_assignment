import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "My name is nikhil";

        inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate Characters:");
        charCounts.forEach((character, count) -> {
            if (count > 1) {
                System.out.println(character + ": " + count + " times");
            }
        });
    }
}
