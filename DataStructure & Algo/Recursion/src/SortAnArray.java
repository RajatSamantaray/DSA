import java.util.Vector;

public class SortAnArray {
    public static void sort(Vector<Integer> arr){
        if (arr.size()==1) {
            return;
        }
        int temp = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,temp);
    }

    private static void insert(Vector<Integer> arr, int temp) {
        if (arr.size() == 0 || arr.get(arr.size()-1) < temp) {
            arr.add(temp);
            return;
        }
        int val = arr.remove(arr.size()-1);
        insert(arr,temp);
        arr.add(val);
        return;
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(3);
        vector.add(5);
        vector.add(2);
        sort(vector);
    }
}
