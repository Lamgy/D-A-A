import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10000;
        int[] arr = new int[size];

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }

        System.out.print("Before sorting: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(arr);

        System.out.println("After sorting:  ");

        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}