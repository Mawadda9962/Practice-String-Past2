public class SameNunMultiTimes {
    public static void main(String[] args){

        System.out.println(sameNum("catdog"));
        System.out.println(sameNum("catcat"));




    }
    public static Boolean sameNum (String str){

        int contOfCat = 0;
        int coutnOfDog = 0;
        for (int i = 0; i < str.length() -2; i++ ){
            if (str.substring(i, i + 3).equals("Cat")){

            }
            if (str.substring(i, i + 3).equals("dog")){

            }
        }
        return contOfCat == coutnOfDog
    }
}
