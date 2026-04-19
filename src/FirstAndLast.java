public class FirstAndLast {
    public static void main(String[] args){

        System.out.println(firstAndLast("breadjambread"));
        System.out.println(firstAndLast("xxbreadjambreadyy"));
        System.out.println();
    }
    public static String firstAndLast (String str){

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");


        if (first == -1){
            return "";
        }
        return str.substring(first + 5, last);

    }
}
