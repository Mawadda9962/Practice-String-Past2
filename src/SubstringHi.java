public class SubstringHi {
    public static void main(String[] args){

        System.out.println(hiAppears("abc hi ho"));

    }

    public static String hiAppears(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if (str.length(i) == "hi"){
                count ++;
            }
        }
        return count;
    }
}
