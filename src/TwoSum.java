//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = new int[]{3,3};
        int target = 6;
        System.out.println(Arrays.toString(arr));  // code to print the array without loop
        HashMap<Integer,Integer> hashMap =  new HashMap<>();  //defining Hashmap
        for(int i=0;i<arr.length;i++){  // Loop to insert array in hashmap and find the sum
            if(hashMap.containsKey(target-arr[i]))
                System.out.println(hashMap.get(target-arr[i])+" "+i);  // Printing the output ( index )
            else
                hashMap.put(arr[i],i); // putting value in the hashmap
        }
    }
}
