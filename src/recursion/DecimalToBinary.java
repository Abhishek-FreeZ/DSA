package recursion;

public class DecimalToBinary {
    static int decimalToBinary(int num){
        if(num<=0)
            return 0;
        return num%2 + 10*decimalToBinary(num/2);
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(7));
    }
}
