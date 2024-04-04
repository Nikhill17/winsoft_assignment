import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String inputString = "My name is nikhil , and nikhil is very common name";

        String[] words = inputString.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                int count = wordCounts.getOrDefault(word, 0);
                wordCounts.put(word, count + 1);
            }
        }

        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int uniqueWords = wordCounts.size();
        System.out.println("Total number of unique words: " + uniqueWords);
    }
}
