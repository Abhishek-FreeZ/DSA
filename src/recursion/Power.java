// Program to find the Power of any number any times

//Example 2^4 = 16
//        2*2^3
//            2*2*2^2
//               2*2*2*2^1
//                   2*2*2*2*2^0
//                      2*2*2*2*1 = 2*2*2*2 = 16

package recursion;

public class Power {

    static double power(double num,double exp){
        if(exp==0)
            return 1.0;  // Base condition i.e. where the recursion ends
        if(exp<1)
            return power(num,exp+1)/num;   // for negative power
        return num*power(num,exp-1);  // for positive power
    }

    public static void main(String[] args) {
        System.out.println(power(2,-10));
    }
}
