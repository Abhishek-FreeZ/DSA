package recursion;// Program to return fibonacci number using the index

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int num){
        if(num<0)
            return -1;
        if(num==0||num==1)
            return num;
        return fibonacci(num-1)+fibonacci(num-2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the index of fibonacci number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibonacci(a));  // 0,1,1,2,3,5,8,13,21,34,55
    }
}
