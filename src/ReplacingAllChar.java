public class ReplacingAllChar {
    public static void main(String[] args) {


    }

    public static String replacingAllChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y') {
                System.out.println(str.charAt(i));

            } else {
                System.out.println("+");
            }


        }
    }
}
