public class FindAllSubString {
    public static void getAllSubString(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        getAllSubString(input.substring(1),output+input.charAt(0));
        getAllSubString(input.substring(1),output);
    }
    public static void main(String[] args) {
        String s = "abcd";
     //   System.out.println(s.substring(1)+" "+s.charAt(0) );
        getAllSubString(s,"");
    }
}
