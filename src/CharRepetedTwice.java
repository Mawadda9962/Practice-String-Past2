public class CharRepetedTwice {
    public static void main(String[] args){

        String message = "The";
        System.out.println(doubleChar(message));
    }

    public static String doubleChar (String mass){
        String result = "";

        for(int i = 0; i < mass.length(); i++){
            result += mass.charAt(i);
            result += mass.charAt(i);
        }
        return result;
    }
}
