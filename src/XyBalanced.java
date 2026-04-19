public class XyBalanced {
    public static void main(String[] args) {

    }

    public static boolean xyBalanced(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).equals("x")) {
                if (str.substring(str.length()).equals("y")) {
                    return true;
                }
            }
            return false;

        }
    }
