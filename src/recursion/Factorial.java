package recursion;

public class Factorial {

    public static int factorial(int num){
        if(num<0)
            return -1;
        else if(num==0)
            return 1; // Base condition i.e. where the recursion ends
        else
            return num* factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
