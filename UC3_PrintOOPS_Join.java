class OOPSBannerUC3 {
    public static void main(String[] args) {

        // Letter O
        String[] O = {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };

        // Letter P
        String[] P = {
            "*****",
            "*   *",
            "*****",
            "*    ",
            "*    "
        };

        // Letter S
        String[] S = {
            "*****",
            "*    ",
            "*****",
            "    *",
            "*****"
        };

        // Print O O P S using String.join()
        for (int i = 0; i < 5; i++) {
            System.out.println(String.join("  ", O[i], O[i], P[i], S[i]));
        }
    }
}