import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DictionaryLookup {

    public static void main(String[] args) {

        Set<String> dictionary = new HashSet<>();

        dictionary.add("apple");
        dictionary.add("banana");
        dictionary.add("orange");
        dictionary.add("grape");
        dictionary.add("mango");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        if (dictionary.contains(word)) {
            System.out.println("The word exists in the dictionary.");
        } else {
            System.out.println("The word was not found.");
            System.out.println("Suggestions:");

            boolean found = false;

            for (String w : dictionary) {
                if (w.startsWith("" + word.charAt(0))) {
                    System.out.println("- " + w);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No suggestions available.");
            }
        }

        scanner.close();
    }
}
