import java.util.Stack;

public class MaxAreaOfBinaryHistogram {
    public static int getTheMaximumAreaOfBinaryHistogram(int[][] arr) {
        int maxArea = 0;
        int[] rowValue = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (arr[i][j] == 0) {
                    rowValue[j] = 0;
                } else {
                    rowValue[j] += arr[i][j];
                }

            }
            System.out.println();
            maxArea = Math.max(maxArea, getTheMaxAreaHistogram(rowValue));
        }
        return maxArea;
    }

    public static int getTheMaxAreaHistogram(int[] arr) {
        int area = 0;
        int[] inputNSL = new int[arr.length];
        int[] inputNSR = new int[arr.length];
        int[] width = new int[arr.length];
        Stack<StackEntity> stack = new Stack<>();
        Stack<StackEntity> stack1 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek().value < arr[i]) {
                    inputNSL[i] = stack.peek().key;
                    stack.add(new StackEntity(i, arr[i]));
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                inputNSL[i] = -1;
                stack.add(new StackEntity(i, arr[i]));
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack1.isEmpty()) {
                if (stack1.peek().value < arr[i]) {
                    inputNSR[i] = stack1.peek().key;
                    stack1.add(new StackEntity(i, arr[i]));
                    break;
                } else {
                    stack1.pop();
                }
            }
            if (stack1.isEmpty()) {
                inputNSR[i] = arr.length;
                stack1.add(new StackEntity(i, arr[i]));
            }
        }
        for (int i = 0; i < inputNSL.length; i++) {
            width[i] = inputNSR[i] - inputNSL[i] - 1;
            area = Math.max(area, arr[i] * width[i]);

        }
        return area;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 0}};
        System.out.println(getTheMaximumAreaOfBinaryHistogram(arr));
    }
}
