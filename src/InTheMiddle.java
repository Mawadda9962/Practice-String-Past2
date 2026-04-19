public class InTheMiddle {
    public static void main(String[] args){


    }
    public static boolean xyzInTheMiddle (String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).equals("xyz")) {

                return true;
            }

        }
        return false;

    }
}
