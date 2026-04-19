public class SurroundingCharactersAreTheSame {
    public static void main(String[] args){


    }
    public static boolean surroundingChar(String str){


        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == "*"){
                if (str.charAt(i - 1) == str.charAt(i + 1)){
                    return true;
                }
            }
        }


        return false;

    }

}
