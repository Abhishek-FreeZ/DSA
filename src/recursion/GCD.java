// Program to find the greatest common divisor using recursion or simply put "HCF"
//
//GCD is the largest common divisor that divides two number without a remainder
// Example gcd(8,12) = 4
// 8 = 2*2*2                                      Euclidean Method
// 12 = 2*2*3                                     gcd(a,0) = a //Base condition
//                                                gcd(a,b) = gcd(b, a mod b)
//                                                gcd(12,8)  = 12/8 --> 1 remainder 4
//                                                            8/4 --> 2 remainder 0
//                                                Do it till remainder is zero
package recursion;

public class GCD {
    static int gcd(int a , int b){
        if(a<0||b<0)
            return 0;
        if(b==0)
            return a;  // Base condition i.e. where the recursion ends
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(8,16));
    }
}
