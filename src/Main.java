import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10000;
        int[] arr = new int[size];

        // Fill with random integers (range: 0–999)
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));

        // Run your merge sort
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}