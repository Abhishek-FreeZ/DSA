package recursion;

public class BinarySearch {
    static boolean found(int[] arr,int s,int e,int k){
        if(s>e)
            return false;
        int mid = s + (e-s)/2;
        if(arr[mid] == k)
            return true;
        else if(arr[mid]>k)
            return found(arr,s, mid-1, k);
        else
            return found(arr,mid+1, e, k);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,20,90};
        int key=20;
        System.out.println(found(arr,0,arr.length-1,key));
    }
}
