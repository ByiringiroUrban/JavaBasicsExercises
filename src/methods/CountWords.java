package methods;

public class CountWords {
    public static int countWords(String sentence, boolean ignoreCase, String excludeWord) {
        if (sentence == null || sentence.isEmpty()) return 0;

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (ignoreCase) {
                if (!word.equalsIgnoreCase(excludeWord)) count++;
            } else {
                if (!word.equals(excludeWord)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Word count: " + countWords("This is a simple test", true, "a"));
    }
}
