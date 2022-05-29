import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Using Two Pointer mathod
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,-1,0,0,1,2,2,-1,-4};
        int target = 0 , front =0 ,last = arr.length -1;
        Arrays.sort(arr);
        List<List<Integer>> lists =  new LinkedList<>();
        for(int i=0;i<arr.length;i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                front = i + 1; last = arr.length-1;
                while (front < last) {
                    if (arr[front] + arr[last] < target - arr[i])
                        front++;
                    else if (arr[front] + arr[last] > target - arr[i])
                        last--;
                    else {
                        lists.add(Arrays.asList(arr[i], arr[front], arr[last]));
                        while(front<last && arr[front]==arr[front+1]) front++;
                        while(front<last && arr[last]==arr[last-1] ) last--;
                        front++;
                        last--;
                    }
                }
            }
        }
        for( List list : lists){
            System.out.println(list);
        }
    }

}
