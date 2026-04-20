public class BPattern {
    public static void main(String[] args){

        System.out.println(bPattern("abcbob"));
        System.out.println(bPattern("b9b"));
    }
    public static boolean bPattern (String str){

        for(int i = 0; i < str.length(); i++){
            if(str.substring(i).equals("b")){

            }
            if(str.substring(i + 2).equals("b")){
            }
            return true;
        }
        return false;

    }
}

