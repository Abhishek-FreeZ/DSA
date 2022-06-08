//Program to check if second array is a permutation of first array or not
// Example [1,2,3,4,5] and [2,3,4,1,5] => true
// [1,2,3,4] and [1,2,3,4,5] => false
// [1,1,2,3,4] and [1,2,3,4,5] => false
// [1,1,2,3,4,5] and [1,2,2,3,4,5] =>false
package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
    static boolean solution(int[] array1, int[] array2){
        List<Integer> list = new LinkedList<>();
        if (array1.length!=array2.length)
            return false;
        for(int i=0;i<array1.length;i++)
            list.add(array1[i]);
        for(int i=0;i<array2.length;i++)
            list.remove(new Integer(array2[i]));
        return list.isEmpty();
    }

    static boolean solution2(int[] array1,int[] array2){
        if(array1.length!=array2.length)
            return false;
        int sum1=0,sum2=0,mul1=1,mul2=1;
        for(int i=0;i<array1.length;i++){
            sum1+=array1[i];
            sum2+=array2[i];
            mul1*=array1[i];
            mul2*=array2[i];
        }
        if(sum1==sum2 && mul1==mul2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int array1[] =new int[]{1,1,2,3,4,5};
        int array2[] = new int[]{1,2,2,3,4,5};
        System.out.println(solution(array1,array2));
        System.out.println(solution2(array1,array2));
    }
}
