public class RepeatWithSeparator {
    public static void main(String[] args){

        System.out.println(repeatWord("Word", "X", 3));
    }
    public static String repeatWord (String str, String Sep, int n){

        String result = "";

        for(int i = 0; i < n; i++){
            result += str + Sep ;
        }

        return result;
    }
}