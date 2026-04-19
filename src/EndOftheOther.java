public class EndOftheOther {
    public static void main(String[] args){

        System.out.println(endOfTheOther("Hiabc", "abc"));
        System.out.println(endOfTheOther());
    }
    public static boolean endOfTheOther (String str1 ,String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() >= str2.length()){
            return str1.endsWith(str2);
        }else {
            return str2.endsWith(str1);
        }

    }
}
