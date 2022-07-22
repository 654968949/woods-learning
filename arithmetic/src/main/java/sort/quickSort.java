package sort;

/**
 * @author : Woods
 * @ClassName : quickSort
 * @date : 2022/4/4  4:42 PM
 * @Version ：1.0
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 2, 4};
        qSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void qSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            qSort(arr, left, pivot - 1);
            qSort(arr, pivot + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
