public class NCharacters {
    public static void main(String[] args){

        System.out.println(repeatEnd("Hello", 3));
    }
    public static String repeatEnd(String str, int n){

        String last = str.substring(str.length() - n);
        String result = "";

        for(int i = 0; i < n; i++){
            result = result + last;
        }

        return result;
    }
}