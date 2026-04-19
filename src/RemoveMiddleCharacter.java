public class RemoveMiddleCharacter {
    public static void main(String[] args){

        System.out.println(removeMidd("zipXzap"));

    }
    public static String removeMidd (String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {

                result += "z";
                result += "p";
                i += 2;

            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }
}