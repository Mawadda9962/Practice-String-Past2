public class InTheMiddle {
    public static void main(String[] args){

        System.out.println(xyzInTheMiddle("AAxyzBB"));
        System.out.println();
    }
    public static boolean xyzInTheMiddle (String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+3).equals("xyz")) {

                return true;
            }

        }
        return false;

    }
}
