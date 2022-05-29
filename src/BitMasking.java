//No of Bits required to change A to B

import java.util.Scanner;

public class BitMasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        int tempa=a;
        System.out.println("Enter B");
        int b = sc.nextInt();
        int tempb=b;
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        while(tempa!=0){
            s.append(Integer.toString(tempa&1));
            tempa=tempa>>1;
        }
        while(tempb!=0){
            s1.append(Integer.toString(tempb&1));
            tempb=tempb>>1;
        }
        System.out.println("Binary representation of A is : "+s.reverse());
        System.out.println("Binary representation of B is : "+s1.reverse());

        int c= a^b;
        int count = 0;
        while(c!=0){
            c=c&(c-1);
            count++;
        }
        System.out.println("Bits required to be changed are "+count);
    }
}
