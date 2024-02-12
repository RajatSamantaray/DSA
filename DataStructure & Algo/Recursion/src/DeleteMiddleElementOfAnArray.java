import java.util.Stack;

public class DeleteMiddleElementOfAnArray {
    public static void deleteElement(Stack<Integer> stack,int middleIndx){

        if(stack.size()==middleIndx){
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteElement(stack,middleIndx);
        stack.add(temp);
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(3);
        stack.add(5);
        stack.add(2);
        stack.add(7);
        int midElement=(stack.size()+1)/2;
        deleteElement(stack, midElement);
        System.out.println(stack);
    }
}
