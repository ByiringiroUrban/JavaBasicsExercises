package methods;

public class CountVowels {
    public static int countVowels(String text, char[] includeExtra, boolean caseSensitive) {
        String vowels = "aeiou";
        if (!caseSensitive) text = text.toLowerCase();

        int count = 0;
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(Character.toLowerCase(c)) >= 0) count++;
            if (includeExtra != null) {
                for (char extra : includeExtra) {
                    if (Character.toLowerCase(c) == Character.toLowerCase(extra)) count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Happy Year", new char[]{'y'}, false)); // includes 'y'
    }
}
