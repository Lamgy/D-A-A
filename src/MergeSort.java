public class MergeSort {
    void mergeSort(int[] arr) {
        int[] buffer = new int[arr.length];
        mergeSort(arr, buffer, 0, arr.length - 1);
    }
    void InsertionSort(int[] buffer, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = buffer[i];
            int j = i - 1;

            // shift larger elements to the right
            while (j >= left && buffer[j] > temp) {
                buffer[j + 1] = buffer[j];
                j--;
            }

            buffer[j + 1] = temp;
        }
    }

    void mergeSort(int[] arr, int[] buffer, int left, int right) {
        if (left >= right) return;

        if(right - left < 8){
            InsertionSort(buffer, left, right);
        }
        int mid = (left + right) / 2;
        mergeSort(arr, buffer, left, mid);
        mergeSort(arr, buffer, mid + 1, right);

        LinearMerge(arr, buffer, left, mid, right);
    }
    void LinearMerge(int[] arr, int[] buffer, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                buffer[k++] = arr[i++];
            } else {
                buffer[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            buffer[k++] = arr[i++];
        }

        while (j <= right) {
            buffer[k++] = arr[j++];
        }

        if (right + 1 - left >= 0) System.arraycopy(buffer, left, arr, left, right + 1 - left);
    }
}
