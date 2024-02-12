public class PrintNBinaryNumber {
    public static void generateNBinaryNumber(String out, int n, int ones, int zeros) {
        if (n == 0) {
            System.out.println(out);
            return;
        }
        generateNBinaryNumber(out + "1", n - 1, ones + 1, 0);
        if (ones > zeros) {
            generateNBinaryNumber(out + "0", n - 1, ones, zeros + 1);
        }
    }

    public static void main(String[] args) {
        generateNBinaryNumber("1", 4, 1, 0);
    }
}
