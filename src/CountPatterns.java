public class CountPatterns {
    public static void main(String[] args){


    }
    public static Integer countPatterns (String str){

        int count = 0;
        for(int i = 0; i < str.length() -1; i++){
            if(str.substring(i, i + 1).equals("co")){
                count ++;

            }
        }
        return count;

    }
}
