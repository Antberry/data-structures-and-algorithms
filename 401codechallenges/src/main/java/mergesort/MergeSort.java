package mergesort;

public class MergeSort {
    private static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        for(int k = 0; k < arr3.length; k++){
            if(i >= arr1.length){
                arr3[k] = arr2[j++];
            } else if(j>= arr2.length){
                arr3[k] = arr1[i++];
            } else if(arr1[i] <= arr2[j]){
                arr3[k] = arr1[i++];
            } else {
                arr3[k] = arr2[j++];
            }
        }
        return arr3;
    }

    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if(n <= 1){
            return arr;
        }
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n - n/2];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr[i];
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[i + n/2];
        }
        return merge(mergeSort(arr1), mergeSort(arr2));
     }
}
