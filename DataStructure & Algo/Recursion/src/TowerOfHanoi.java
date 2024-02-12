public class TowerOfHanoi {
    public static void tohRecursion(char source, char dest, char help, int noDisc) {
        if (noDisc == 0) {
            return;
        }
        tohRecursion(source, help, dest, noDisc - 1);
        System.out.println(noDisc + " is in " + dest);
        tohRecursion(help, dest, source, noDisc - 1);
    }

    public static void main(String[] args) {
        tohRecursion('s','d','h',3);
    }
}
