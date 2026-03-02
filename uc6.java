public class UC6 {

    // Method to generate letter O
    public static String[] getO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    // Method to generate letter P
    public static String[] getP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };
    }

    // Method to generate letter S
    public static String[] getS() {
        return new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        };
    }

    public static void main(String[] args) {

        String[] o1 = getO();
        String[] o2 = getO();
        String[] p = getP();
        String[] s = getS();

        // Loop to print OOPS
        for (int i = 0; i < o1.length; i++) {
            System.out.println(
                    String.join("   ", o1[i], o2[i], p[i], s[i])
            );
        }
    }
}