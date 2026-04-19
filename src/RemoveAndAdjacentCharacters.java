import java.beans.PropertyEditorSupport;

public class RemoveAndAdjacentCharacters {
    public static void main (String[] args){

    }
    public static String removeChar (String str){

        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*'){
                i++;
                continue;

            }
        }
        return result;

    }
}
