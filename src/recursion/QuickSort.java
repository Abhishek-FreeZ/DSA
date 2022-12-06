package recursion;

import java.util.Arrays;

// Base condition s>=e
// Pivoting ( returns pivot index and left side is less than pivot and right side is greater than pivot
// Recursive call left and right side
public class QuickSort {

    int pivoting(int[] arr,int s,int e){
        int pivot = arr[s];
        int count = 0;
//        counting number of values less than pivot
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot)
                count++;
        }
//      Swapping value at pivot index with pivot
        int pivotIndex = s+count;
        arr[s] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

//       Making array such that all value less than pivot is on left side and all element greater than pivot is on right side
        int i=s;
        int j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if(i<pivotIndex && j>pivotIndex){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }


        return pivotIndex;
    }
    void quickSort(int[] arr,int s,int e){
        if(s>=e)
            return;

        int pivotIndex = pivoting(arr,s,e);
        quickSort(arr,s,pivotIndex-1);
        quickSort(arr,pivotIndex+1,e);

    }


    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] arr = {23,3,42,5,23,12,10,5,65,3,2,45,2,5,7,45,84,6,34,2};
        int len = arr.length-1;
        q.quickSort(arr,0,len);
        System.out.println(Arrays.toString(arr));
    }
}
