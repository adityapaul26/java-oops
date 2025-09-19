package sorting;

public class BubbleSort {
    void bubbleSort(int[] arr){
        int size= arr.length;

        for(int i=0;i< size-1;i++){
            for(int j=0;j < size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
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
