public class PermutationWithCases {
    public static void getAllPermutaionwithCases(String input,String ouput){
        if (input.length()==0){
            System.out.println(ouput);
            return;
        }
        getAllPermutaionwithCases(input.substring(1),ouput+input.charAt(0));
        getAllPermutaionwithCases(input.substring(1),ouput+Character.toUpperCase(input.charAt(0)));

    }
    public static void main(String[] args) {
        String s = "ab";
        getAllPermutaionwithCases(s,"");
    }
}
