public class DecreasingPrefixes {
    public static void main(String[] args){

        System.out.println(decreasingPrefixes("Chocolate", 4));
        System.out.println(decreasingPrefixes("Chocolate", 3));
    }
    public static String decreasingPrefixes (String str, int n){

        String result = "";

        for(int i = n; i > 0; i--){
            result += str.substring(0, i);
        }

        return result;
    }
}
