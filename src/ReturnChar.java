public class ReturnChar {
    public static void main(String[] args){

        System.out.println(returnBeforeAndAfter("abcXY123XYijk", "XY"));

    }

    public static String returnBeforeAndAfter(String str, String word){

        String result = "";
        int lenWord = word.length();

        for(int i = 0; i <= str.length() - lenWord; i++){

            if(str.substring(i, i + lenWord).equals(word)){

                if(i > 0){
                    result += str.charAt(i - 1);
                }

                if(i + lenWord < str.length()){
                    result += str.charAt(i + lenWord);
                }
            }
        }

        return result;
    }
}
