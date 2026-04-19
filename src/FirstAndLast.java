public class FirstAndLast {
    public static void main(String[] args){

        System.out.println(firstAndLast("breadjambread"));
    }
    public static String firstAndLast (String str){

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        return str.substring(first + 5,last);

    }
}
