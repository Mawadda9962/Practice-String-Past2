public class MoveTheFirstToEnd {
    public static void main(String[] args){

    }
    public static Boolean firstToEnd(String str){

        String result = "";

        for(int i = 0; i < str.length(); i++){

            result += str.charAt(i + 3);
            result += str.charAt(i + 2);
            result += str.charAt(i);

        }
        return result;
    }
}
