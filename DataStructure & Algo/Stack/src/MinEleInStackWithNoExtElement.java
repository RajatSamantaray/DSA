import java.util.Stack;

public class MinEleInStackWithNoExtElement {
    Stack<Integer> stack =new Stack<>();
    int minElement;
    private void push(int input){
        if(stack.isEmpty()){
            stack.add(input);
            minElement=input;
        }else{
            if(stack.peek()>input){
                stack.add(input*2-minElement);
                minElement=input;
            }else{
                stack.add(input);
            }
        }
    }
    private int pop(){
        int returnValue=0;
        if(stack.isEmpty()){
            return -1;
        }else{
            if(stack.peek()<minElement){
                 returnValue = minElement;
                minElement=minElement*2- stack.pop();
            }else{
                returnValue = stack.pop();
            }
        }
        return returnValue;
    }
    private int minElement(){
        if(stack.isEmpty()){
            return -1;
        }
        return minElement;
    }

    public static void main(String[] args) {
        MinEleInStackWithNoExtElement minElement = new MinEleInStackWithNoExtElement();
        minElement.push(18);
        minElement.push(19);
        System.out.println(minElement.minElement());
        minElement.push(29);
        minElement.push(15);
        System.out.println(minElement.minElement());
        System.out.println(minElement.pop());
        System.out.println(minElement.minElement());
        minElement.push(16);
        System.out.println(minElement.minElement());
        minElement.push(18);
        minElement.push(19);
        System.out.println(minElement.minElement());
        minElement.push(29);
        minElement.push(15);
        System.out.println(minElement.minElement());
        minElement.pop();
        System.out.println(minElement.minElement());
        minElement.push(16);
        System.out.println(minElement.minElement());
    }
}
