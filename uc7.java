public class UC7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create Character Pattern Objects
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        String word = "OOPS";

        CharacterPatternMap[] patterns = {O, O, P, S};

        // Print banner using StringBuilder
        for (int i = 0; i < patterns[0].getPattern().length; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}