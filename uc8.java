import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized Pattern Storage
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize Patterns
    static {
        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";

        int height = patternMap.get('O').length;

        // Nested loop to print banner
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}