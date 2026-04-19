public class NotImmedediately {
    public static void main(String[] args){

        System.out.println(notImmediately("abcxyz"));
        System.out.println(notImmediately("abc.xyz"));
    }
    public static boolean notImmediately(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i - 3).equals("xyz")) {

            if (i == 0 || str.charAt(i - 1) != '.') {
                return true;
            }
        }
    }
    return false;
    }
}
