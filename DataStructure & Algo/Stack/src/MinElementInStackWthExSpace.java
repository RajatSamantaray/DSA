import java.util.Stack;

public class MinElementInStackWthExSpace {
    Stack<Integer> stack;
    Stack<Integer>  minElementStack;
    public MinElementInStackWthExSpace(){
        stack =new Stack<>();
        minElementStack=new Stack<>();
    }
    private void push(int inValue){
        stack.add(inValue);
        if(minElementStack.isEmpty()){
            minElementStack.add(inValue);
        }else{
            if(minElementStack.peek()>inValue){
                minElementStack.add(inValue);
            }
        }
    }
    private  int pop(){
        int popedValue = stack.pop();
        if(popedValue==minElementStack.peek()){
            minElementStack.pop();
        }
        return popedValue;
    }
    private  int minElement(){
        if(minElementStack.isEmpty()){
            return -1;
        }
        return minElementStack.peek();
    }
    public static void main(String[] args) {
        MinElementInStackWthExSpace minElementInStackWthExSpace= new MinElementInStackWthExSpace();
        minElementInStackWthExSpace.push(18);
        minElementInStackWthExSpace.push(19);
        System.out.println(minElementInStackWthExSpace.minElement());
        minElementInStackWthExSpace.push(29);
        minElementInStackWthExSpace.push(15);
        System.out.println(minElementInStackWthExSpace.minElement());
        minElementInStackWthExSpace.pop();
        System.out.println(minElementInStackWthExSpace.minElement());
        minElementInStackWthExSpace.push(16);
        System.out.println(minElementInStackWthExSpace.minElement());
    }
}
