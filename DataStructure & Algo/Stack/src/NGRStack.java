import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NGRStack {


    public static int[] getNearestGretestElement(int[] arr) {
        Stack<Integer> stack = new Stack();
        int[] out = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty()) {
                if (stack.peek() > arr[i]) {
                    out[i] = stack.peek();
                    stack.add(arr[i]);
                    break;
                } else {
                    stack.pop();

                }
            }
            if (stack.isEmpty()) {
                out[i] = -1;
                stack.add(arr[i]);
            }
        }


        return out;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] out=getNearestGretestElement(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+ " "+out[i]);
        }
        System.out.println();
    }
}
