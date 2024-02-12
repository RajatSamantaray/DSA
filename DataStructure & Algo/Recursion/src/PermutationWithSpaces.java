public class PermutationWithSpaces {
    public static void getAllPermutaionwithSpaces(String input,String ouput){
        if (input.length()==0){
            System.out.println(ouput);
            return;
        }
        getAllPermutaionwithSpaces(input.substring(1),ouput+"_"+input.charAt(0));
        getAllPermutaionwithSpaces(input.substring(1),ouput+input.charAt(0));

    }
    public static void main(String[] args) {
    String s="abcd";
    getAllPermutaionwithSpaces("bcd","a");
    }
}
