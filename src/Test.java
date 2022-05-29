public class Test {

    static int factorial(int num){
        if(num<0) {
            System.out.println("Factorial of negative number is not possible");
            return 0;
        }
        else if(num==0)
            return 1;
        else
            return num*factorial(num-1);
    }

//    static int fibonacci(int num){
//
//    }
    public static void main(String[] args) {
        System.out.println("This is being changed through local system");
        System.out.println(factorial(-10));
    }
}
