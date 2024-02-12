import java.util.Stack;

public class SortAStack {
    public static void sort(Stack<Integer> stack){
     if (stack.size()==1){
         return;
     }
     int temp = stack.pop();
     sort(stack);
     insert(stack,temp);
    }

    private static void insert(Stack<Integer> stack, int temp) {
        if(stack.size()==0 ||stack.peek()<temp){
            stack.add(temp);
            return;
        }
        int value = stack.pop();

        insert(stack,temp);
        stack.add(value);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(3);
        stack.add(5);
        stack.add(2);
        sort(stack);

    }
}
