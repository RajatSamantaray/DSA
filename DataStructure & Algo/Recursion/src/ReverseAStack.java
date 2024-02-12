import java.util.Stack;

public class ReverseAStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
       // int temp = stack.firstElement();
        int popEle= stack.pop();

        reverse(stack);
        insert(stack,popEle);
    }

    private static void insert(Stack<Integer> stack, int popEle) {
        if(stack.isEmpty()){
            stack.add(popEle);
            return;
        }
        int temp= stack.pop();
        insert(stack,popEle);
        stack.add(temp);
    }

    public static void main(String[] args) {
     Stack<Integer> stack =new Stack<>();
     stack.add(1);
     stack.add(3);
     stack.add(5);
     stack.add(7);
     System.out.println(stack);
     reverse(stack);
        System.out.println(stack);
    }
}
