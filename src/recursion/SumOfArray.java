package recursion;


import java.util.Arrays;

public class SumOfArray {

    static int sum(int[] arr,int size){
        if(size==0)
            return 0;
        return arr[0] + sum(Arrays.copyOfRange(arr,1,size),size-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sum(arr,arr.length));
    }
}
