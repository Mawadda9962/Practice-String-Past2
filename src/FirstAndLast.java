public class FirstAndLast {
    public static void main(String[] args){

        System.out.println(firstAndLast("breadjambread"));
        System.out.println(firstAndLast("xxbreadjambreadyy"));
        System.out.println(firstAndLast("xxbreadyy"));
    }
    public static String firstAndLast (String str){

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");


        if (first == -1 || first == last){
            return " ";
        }
        return str.substring(first + 5, last);

    }
}
