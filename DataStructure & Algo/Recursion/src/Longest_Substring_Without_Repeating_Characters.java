import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
         return checkSubStirng(s,0,"","",0,s.length());
    }

    public int checkSubStirng(String s,int count, String s1,String s2, int index, int highestIndex) {
        if (index == highestIndex) {
            if(count==0){
                return s.length();
            }else if(count<s1.length()){
                return s1.length();
            }else return count;

        }

        if (s1.contains(String.valueOf(s.charAt(index)))) {

            if(s1.length()>count){
                s2=s1;
                count = s1.length();
            }
            s1 = String.valueOf(s.charAt(index));

        }else{
            s1 = s1+s.charAt(index);
        }
        return checkSubStirng(s,count,s1,s2,index+1,highestIndex);
    }

    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }
    public static void main(String[] args) {
        String s = " ";
        Longest_Substring_Without_Repeating_Characters lswrc = new Longest_Substring_Without_Repeating_Characters();
        System.out.println(lswrc.getUniqueCharacterSubstring(s));
    }
}
