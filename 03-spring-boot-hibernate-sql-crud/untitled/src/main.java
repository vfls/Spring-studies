import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(wordOcurrence(input));

        sc.close();
    }

    public static int wordOcurrence(String input) {
        String[] words = input.split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 1);
            } else {
                int count = wordMap.get(word) + 1;
                wordMap.put(word, count);
            }
        }
        int wordCount = 0;
        for (String word : wordMap.keySet()) {
            if (wordMap.get(word) > wordCount) {
                wordCount = wordMap.get(word);
            }
        }
        return wordCount;
    }
}
