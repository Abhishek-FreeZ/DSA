//find two integers in the arrays whose product is maximum considering only positive integers
// Example [1,2,3,10,20] => 10,20

package arrays;

import java.util.HashSet;
import java.util.Set;

public class MaxProdOfTwoIntegers {
    static String solution(int[] arr){
        Set<Integer> set = new HashSet<>();
        int max =0,max1=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
            set.add(arr[i]);
        }
        set.remove(max);
        for(int i: set){
            if(max1<i)
                max1 =i;
        }
        return max1+","+max;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,10,12};
        System.out.println(solution(arr));
    }
}
