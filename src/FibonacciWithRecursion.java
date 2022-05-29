public class FibonacciWithRecursion {

    public static int fibonacci(int num){
        if(num<0)
            return -1;
        else if(num==0)
            return 1;
        else
            return num*fibonacci(num-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
