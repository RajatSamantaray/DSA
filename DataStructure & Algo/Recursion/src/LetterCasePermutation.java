import java.util.HashSet;
import java.util.Set;

public class LetterCasePermutation {
    public static Set<String> set = new HashSet<>();
    public static void getAllLetterCasePermutation(String input,String output){
        if(input.length()==0){
            set.add(output);
            return;
        }
        if(Character.isDigit(input.charAt(0))){
            //output=;
            //input= input.substring(1);
          //  getAllLetterCasePermutation(input.substring(1),);
            getAllLetterCasePermutation(input.substring(1),output+input.charAt(0));

        }
        getAllLetterCasePermutation(input.substring(1),output+input.charAt(0));
        getAllLetterCasePermutation(input.substring(1),output+Character.toUpperCase(input.charAt(0)));
    }
    public static void main(String[] args) {
    String s = "a1b2";
    getAllLetterCasePermutation(s,"");
        System.out.println(set);
    }
}
