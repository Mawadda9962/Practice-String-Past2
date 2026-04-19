public class bPattern {
    public static void main(String[] args){

        System.out.println(BPattern("abcbob"));
        System.out.println(BPattern("b9b"));
    }
    public static boolean BPattern (String str){

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

