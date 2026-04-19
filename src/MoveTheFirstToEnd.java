public class MoveTheFirstToEnd {
    public static void main(String[] args){
        System.out.println(firstToEnd("abc"));

    }
    public static String firstToEnd(String str){

        String result = "";

        for(int i = 0; i < str.length(); i += 3){

            result += str.charAt(i + 1);
            result += str.charAt(i + 2);
            result += str.charAt(i);

        }
        return result;
    }
}
