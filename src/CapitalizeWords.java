public class CapitalizeWords {
    static String capitalized(String str){
        String capital="";
        String[] words = str.split("\\s");
        for(String word : words){
            capital += word.substring(0,1).toUpperCase()+word.substring(1)+" ";
        }
        return capital;
    }

    public static void main(String[] args) {
        String str = "this is an example of how capitalized works";
        System.out.println(capitalized(str));
    }
}
