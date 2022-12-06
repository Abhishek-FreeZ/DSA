package recursion;
import java.util.Arrays;
// Base condition s>=e
// Recursive call of left and right side
// Merging both side
public class MergeSort {

    void merge(int[] arr,int s,int e){
        int mid = s +(e-s)/2;
        int len1 = mid-s+1;
        int len2 = e-mid;
        int[] arr1 = Arrays.copyOfRange(arr,s,mid+1);
        int[] arr2 = Arrays.copyOfRange(arr,mid+1,e+1);
        int left=0;
        int right=0;
        int index = s;
        while(left < len1 && right < len2 ){
            if(arr1[left] < arr2[right])
                arr[index++] = arr1[left++];
            else
                arr[index++] = arr2[right++];
        }
        while(left<len1)
            arr[index++] = arr1[left++];
        while(right<len2)
            arr[index++] = arr2[right++];
    }
    void mergeSort(int[] arr,int s,int e){
        if(s>=e)
            return;
        int mid = s +(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);

    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] arr = {23,3,42,5,23,12,10,5,65,3,2,45,2,5,7,45,87,6,34,2};
        int len = arr.length-1;
        m.mergeSort(arr,0,len);
        System.out.println(Arrays.toString(arr));
    }
}
