public class XyBalanced {
    public static void main(String[] args) {

        System.out.println(xyBalanced("aaxbby"));
        System.out.println("aaxbb");
    }

    public static boolean xyBalanced(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y') {

                return true;
            }

            }
        return false;
    }
}