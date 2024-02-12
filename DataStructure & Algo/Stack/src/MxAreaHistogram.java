import java.util.Stack;

public class MxAreaHistogram {
    public static int[] getMaxAreaOfHistogram(int[] input) {
        int[] inputNSL = new int[input.length];
        int[] inputNSR = new int[input.length];
        int[] inputWidth = new int[input.length];
        int[] area = new int[input.length];
        Stack<StackEntity> stack = new Stack<>();
        Stack<StackEntity> stack1 = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek().value < input[i]) {
                    inputNSL[i] = stack.peek().key;
                    stack.add(new StackEntity(i, input[i]));
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                stack.add(new StackEntity(i, input[i]));
                inputNSL[i] = -1;
            }

        }
        for (int i = input.length - 1; i >= 0; i--) {
            while (!stack1.isEmpty()) {
                if (stack1.peek().value < input[i]) {
                    inputNSR[i] = stack1.peek().key;
                    stack1.add(new StackEntity(i, input[i]));
                    break;
                } else {
                    stack1.pop();
                }
            }
            if (stack1.isEmpty()) {
                inputNSR[i] = input.length;
                stack1.add(new StackEntity(i, input[i]));
            }
        }
        for (int i = 0; i < inputWidth.length; i++) {
            inputWidth[i] = inputNSR[i] - inputNSL[i] - 1;
            area[i] = input[i] * inputWidth[i];
        }

        return area;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        int[] out = getMaxAreaOfHistogram(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + out[i]);
        }
        System.out.println();
    }
}
