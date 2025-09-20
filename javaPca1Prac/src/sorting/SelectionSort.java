package sorting;

public class SelectionSort {
    void selectionSort(int[] arr){
        int n= arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex= i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex])
                    minIndex= j;
            }

            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]= temp;
        }
    }

    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{2, 5, 1, 9, 7};

        BubbleSort obj = new BubbleSort();

        System.out.println("Unsorted array:");
        for(int x :arr) System.out.print(x + " ");
        System.out.println("\n");
        obj.bubbleSort(arr);

        System.out.println("Sorted array:");
        for(int x :arr) System.out.print(x + " ");
    }
}