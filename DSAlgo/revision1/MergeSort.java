package DSAlgo.revision1;

import java.util.Arrays;

//Merge sort
public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {
        if(low == high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[arr.length];
        int k = 0;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while(left <= mid) {
            temp[k++] = arr[left++];
        }
        while(right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void main(String arg[]){
        int[] nums = {3, 4, 1, 6, 2, 5, 7};

        mergeSort(nums, 0, nums.length-1);
        Arrays.stream(nums).forEach(System.out::println);
    }

}