public class MergeTwoStrings {
    public static void main(String[] args){

        System.out.println(mergeTwoStrings("abc", "xyz"));


    }
    public static String mergeTwoStrings (String str1 ,String str2 ){

        String result = "";
        int  i =0;

        while(i < str1.length() && i < str2.length()){
            result += str1.charAt(i) + str2.charAt(i);
            i++;
        }
        result += str1.substring(i) + str2.substring(i);
        return result;


    }
}
