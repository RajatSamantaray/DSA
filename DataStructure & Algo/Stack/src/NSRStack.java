import java.util.Stack;

public class NSRStack {
    public static int[] getSmallestfromRightSide(int[] arr) {
        int[] out = new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            while(!stack.isEmpty()){
                if(stack.peek()< arr[i]){
                    out[i] = stack.peek();
                    stack.add(arr[i]);
                    break;
                }else{
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                out[i] = -1;
                stack.add(arr[i]);
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] out = getSmallestfromRightSide(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + out[i]);
        }
        System.out.println();    
    }

   

}
