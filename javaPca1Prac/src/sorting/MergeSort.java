package sorting;

public class MergeSort {
    static void merge(int[] arr,int s,int e){
        int mid= (s+e)/2;

        int len1= mid - s +1;
        int len2= e -(mid+1)+1;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        int k=s;

        for(int i=0;i<len1;i++) arr1[i]=arr[k++];

        for(int i=0;i<len2;i++) arr2[i]=arr[k++];

        int mainArrayIndex=s;
        int i,j;
        i=j=0;

        while(i< len1 && j<len2){
            if(arr1[i]<arr2[j]){
                arr[mainArrayIndex++] = arr1[i++];
            }else{
                arr[mainArrayIndex++] = arr2[j++];
            }
        }

        while(i<len1){
            arr[mainArrayIndex++] = arr1[i++];
        }

        while(j<len2){
            arr[mainArrayIndex++] = arr2[j++];
        }
    }

    static void mergeSort(int[] arr,int s,int e){
        if(s>=e)return;
        int mid = (s+e)/2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,e);
    }

    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{2, 5, 1, 9, 7};

        System.out.println("Unsorted array:");
        for(int x :arr) System.out.print(x + " ");
        System.out.println("\n");
        mergeSort(arr,0,4);

        System.out.println("Sorted array:");
        for(int x :arr) System.out.print(x + " ");
    }
}
