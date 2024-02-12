public class PrintNumberUsingRecursion {
    public static void print(int number ){
        if(number == 1){
            System.out.println(number);
            return;
        }
        print(number-1);
        System.out.println(number);
    }
    public static void reversePrint(int number){
        if (number == 1){
            System.out.println(number);
            return;
        }
        System.out.println(number);
        reversePrint(number-1);
    }
    public static void main(String[] args) {
        //print(7);
        reversePrint(7);
    }
}
