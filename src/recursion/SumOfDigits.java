//Program to find the sum of individual digits of a number

//Example 10
//        10/10 --> 1 + remainder 0
//
//        1032
//        1032/10 --> 103 + remainder 2
//                    103/10 --> 10 + remainder 3
//                               10 --> 1 + remainder 0
//
//        --> 1+0+3+2 == 6
//        This will continue until num == 0


package recursion;

public class SumOfDigits {
    static int sumOfDigits(int num){
        if(num<=0)
            return 0;   // Base condition i.e. where the recursion ends
        return num%10+sumOfDigits(num/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1032));
    }
}
