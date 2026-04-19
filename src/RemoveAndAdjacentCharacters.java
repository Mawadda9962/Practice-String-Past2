
public class RemoveAndAdjacentCharacters {
    public static void main (String[] args){

        System.out.println(removeChar("ab*cd"));
    }
    public static String removeChar (String str){

        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                i++;
                continue;

            }
            result += str.charAt(i);
        }
        return result;

    }
}
