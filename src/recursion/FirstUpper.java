/*Given a String find its first uppercase letter
Example
    Abhishek  A
    new Delhi  D
 */

package recursion;

public class FirstUpper {
    static char first(String str){
        if(str.isEmpty())
            return ' ';
        if(!Character.isUpperCase(str.charAt(0)))
            return first(str.substring(1));
        return str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(first("abhdKkdjlsf"));
    }
}
