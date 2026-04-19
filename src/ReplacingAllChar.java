public class ReplacingAllChar {
    public static void main(String[] args) {

        System.out.println(replacingAllChar("12xy34"));
    }

    public static String replacingAllChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 &&
                    str.charAt(i) == 'x' &&
                    str.charAt(i + 1) == 'y') {

                result += "xy";
                i++;

            } else {
                result += "+";
            }
        }

        return result;
    }
}