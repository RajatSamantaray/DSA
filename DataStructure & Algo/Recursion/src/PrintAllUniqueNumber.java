import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintAllUniqueNumber {
    static List<String> set = new ArrayList<>();
    public static void getAllUnqSubString(String in,String op){
        if(in.length()==0){
            set.add(op);
            return;
        }
        getAllUnqSubString(in.substring(1),op+in.charAt(0));
        getAllUnqSubString(in.substring(1),op);
    }

    public static void main(String[] args) {
        String s = "aabcd";
        getAllUnqSubString(s,"");
        System.out.println(set);
    }
}
