public class VedicAsterisks {

    public static void main(String[] args) {
        printVedic();
    }

    private static void printVedic() {
        // Define the lines for each letter
        String[] vLines = {
                "*     *",
                " *   * ",
                "  * *  ",
                "   *   ",
                "   *   "
        };

        String[] eLines = {
                "****** ",
                "*      ",
                "*****  ",
                "*      ",
                "****** "
        };

        String[] dLines = {
                "*****  ",
                "*    * ",
                "*    * ",
                "*    * ",
                "*****  "
        };

        String[] iLines = {
                "  *    ",
                "  *    ",
                "  *    ",
                "  *    ",
                "  *    "
        };

        String[] kLines = {
                "*   *  ",
                "*  *   ",
                "**     ",
                "*  *   ",
                "*   *  "
        };

        // Print side by side
        for (int i = 0; i < vLines.length; i++) {
            System.out.println(
                    vLines[i] + "  " +
                            eLines[i] + "  " +
                            dLines[i] + "  " +
                            iLines[i] + "  " +
                            kLines[i]
            );
        }
    }
}



