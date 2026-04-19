public class NotImmedediately {
    public static void main(String[] args){

    }
    public static boolean notImmediately(String str){
        for(int i = 0; i < str.length() -1; i++){
            if (str.substring(i ,i + 3).equals("xyz"));
        }
           if (i == 0 || str.charAt(i - 1) != '.' ){
               return true;
           }
    }
}
