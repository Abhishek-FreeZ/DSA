// Program that return true if all the numbers in the array are unique
// Example [1,2,3,4,5] => true   [1,2,3,2,1] => false

package arrays;

import java.util.HashSet;

public class IsUnique {
    static boolean solution(int[] intArray){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : intArray){
            if(hashSet.contains(i))
                return false;
            hashSet.add(i);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,2,3,19};
        System.out.println(solution(arr));
    }
}
