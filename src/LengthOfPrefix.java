public class LengthOfPrefix {
    public static void main(String[] args){

        System.out.println(prefixOfLength("abXYabc", 1));

    }
    public static Boolean prefixOfLength(String str, int n){
        return(str.substring(n).contains(str.substring(0, n)));

    }
}
