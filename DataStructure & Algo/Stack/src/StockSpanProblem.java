
import com.sun.xml.internal.stream.Entity;
import jdk.internal.util.xml.impl.Pair;

import java.util.Map;
import java.util.Stack;
class StackEntity{
    public int key;
    public int value;

    public StackEntity(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class StockSpanProblem {

    public static int[] getConsecutiveSmallestNo(int[] arr){
        int[] out = new int[arr.length];
        Stack<StackEntity> stack = new Stack();

        for (int i=0;i <= arr.length-1;i++) {
            int count = 1;
            while(!stack.isEmpty()){
                if (stack.peek().value>arr[i]) {
                out[i] = i-stack.peek().key;
                stack.add(new StackEntity(i,arr[i]));
                break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                out[i] = -1;
                stack.add(new StackEntity(i,arr[i]));
            }
        }
        return out;

    }
    public static void main(String[] args) {
        int[] arr = {20, 100, 80, 60, 70, 75, 85};
        int[] out = getConsecutiveSmallestNo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + out[i]);
        }
        System.out.println();
    }
}
