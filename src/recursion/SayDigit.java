package recursion;

public class SayDigit {
    static String[] strs = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    static void output(int number){
        if(number==0){
            return;
        }
        output(number/10);
        System.out.print(strs[number%10]+" ");
    }
    public static void main(String[] args) {

        output(90374);
    }
}
