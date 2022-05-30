/* write a recursive function called someRecursive which
accepts an array and callback. The function returns true if
a single value in the array returns true when passed to the callback.
Otherwise it returns false.

Example
someRecursive({1,2,3,4},isOdd) #true
someRecursive({4,6,8,9},isOdd) #true
someRecursive({4,6,8},isOdd) #false
 */

package recursion;

import java.util.Arrays;

class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0)
            return false;
        else
            return true;

    }
}

public class SomeRecursion {
    static boolean someRecursive(int[] arr, OddFunction odd) {
        if(arr.length==0)
            return false;
        if(!odd.run(arr[0]))
            return someRecursive(Arrays.copyOfRange(arr,1,arr.length),odd);
        return true;

    }

    public static void main(String[] args) {
        OddFunction odd = new OddFunction();
        int[] arr = new int[]{4,1,6,8};
        System.out.println(someRecursive(arr,odd));
    }
}
