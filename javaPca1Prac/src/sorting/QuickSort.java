package sorting;

public class QuickSort {

    static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[e];
        arr[e] = arr[i + 1];
        arr[i + 1] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e) return;

        int pi = partition(arr, s, e);

        quickSort(arr, s, pi - 1);
        quickSort(arr, pi + 1, e);
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{2, 5, 1, 9, 7};

        System.out.println("Unsorted array:");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("\n");
        quickSort(arr, 0, 4);

        System.out.println("Sorted array:");
        for (int x : arr) System.out.print(x + " ");
    }
}
