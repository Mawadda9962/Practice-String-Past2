public class RepeatWithSeparator {
    public static void main(String[] args){


    }
    public static String repeatWord (String str, String Sep, int n){

        String last = str.substring(str.length() - n);
        String result = "";

        for(int i = 0; i < n; i++){
            result = result + last;
        }

        return result;
    }
}