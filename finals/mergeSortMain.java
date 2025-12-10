class Merge {
    public static void merge(int[] arr, int s, int e) {
        int mid = (s + e) / 2;

        int len1 = mid - s + 1;
        int len2 = e - mid;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        int k = s;

        for (int i = 0; i < len1; i++) {
            arr1[i] = arr[k++];
        }

        for (int i = 0; i < len2; i++) {
            arr2[i] = arr[k++];
        }

        int mainArrayIndex = s;
        int n = 0, m = 0;

        while (n < len1 && m < len2) {
            if (arr1[n] > arr2[m]) {
                arr[mainArrayIndex++] = arr2[m++];
            } else {
                arr[mainArrayIndex++] = arr1[n++];
            }
        }

        while (n < len1) {
            arr[mainArrayIndex++] = arr1[n++];
        }

        while (m < len2) {
            arr[mainArrayIndex++] = arr2[m++];
        }
    }
}

class MergeSort {
    public static void mergeSort(int[] arr, int s, int e) {
        if (s >= e)
            return;

        int mid = (s + e) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        Merge.merge(arr, s, e);
    }
}

class mergeSortMain {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 1, 7 };
        MergeSort.mergeSort(arr, 0, 4);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
