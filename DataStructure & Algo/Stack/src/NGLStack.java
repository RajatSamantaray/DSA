import java.util.Stack;

public class NGLStack {
    public static int[] getGretestfromLeftSide(int[] arr) {
        int[] out =new int[4];
        Stack<Integer> stack =new Stack<>();
        for (int i = 0; i < arr.length; i++) {

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
        int[] out = getGretestfromLeftSide(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + out[i]);
        }
        System.out.println();
    }
}


