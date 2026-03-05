public class OOPSBannerApp {

    // Function to generate line for letter O
    public static String getO(int line) {
        switch (line) {
            case 0:
            case 6:
                return " ***** ";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "*     *";
            default:
                return "";
        }
    }

    // Function to generate line for letter P
    public static String getP(int line) {
        switch (line) {
            case 0:
                return " ***** ";
            case 1:
            case 2:
                return "*     *";
            case 3:
                return " ***** ";
            case 4:
            case 5:
            case 6:
                return "*      ";
            default:
                return "";
        }
    }

    // Function to generate line for letter S
    public static String getS(int line) {
        switch (line) {
            case 0:
            case 6:
                return " ***** ";
            case 1:
            case 2:
                return "*      ";
            case 3:
                return " ***** ";
            case 4:
            case 5:
                return "      *";
            default:
                return "";
        }
    }

    public static void main(String[] args) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("    ",
                    getO(i),
                    getO(i),
                    getP(i),
                    getS(i));
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}