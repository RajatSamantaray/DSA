public class GenerateAllBalancedparathesis {
    public static void getAllBalancedParathesis(String out, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(out);
            return;
        }
        if (open != 0) {
            getAllBalancedParathesis(out + "(", open - 1, close);
        }
        if (close > open) {
            getAllBalancedParathesis(out + ")", open,  close - 1);
        }
    }

    public static void main(String[] args) {
        getAllBalancedParathesis("", 3, 3);
    }
}
