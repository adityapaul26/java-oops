package sorting;

public class InsertionSort {
    void insertionSort(int[] arr){
        int n= arr.length;

        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]= key;
        }
    }

    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{2, 5, 1, 9, 7};

        InsertionSort obj = new InsertionSort();

        System.out.println("Unsorted array:");
        for(int x :arr) System.out.print(x + " ");
        System.out.println("\n");
        obj.insertionSort(arr);

        System.out.println("Sorted array:");
        for(int x :arr) System.out.print(x + " ");
    }
}
