import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> characterMapForA = mapCharacters(a);
        Map<Character, Integer> characterMapForB = mapCharacters(b);

        return characterMapForA.equals(characterMapForB) ? true : false;
    }

    private static Map<Character, Integer> mapCharacters(String a) {
        final String normalizedString = a.toLowerCase();
        Map<Character, Integer> frequencies = new HashMap<>(normalizedString.length());
        for (int i = 0; i < normalizedString.length(); i++) {
            char characterAtI = normalizedString.charAt(i);
            if (frequencies.containsKey(characterAtI)) {
                int count = frequencies.get(characterAtI);
                frequencies.put(characterAtI, ++count);
            } else {
                frequencies.put(characterAtI, 1);
            }
        }
        return frequencies;
    }
}
