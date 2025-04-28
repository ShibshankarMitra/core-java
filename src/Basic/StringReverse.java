package Basic;

public class StringReverse {

    public static void main(String[] args) {
        String s= "Shibsankar";
        reverse(s);
    }

    public static void reverse(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char[] reversedChar= new char[length];
        for(int i=length-1; i>=0; i--){
            reversedChar[length-1-i]=charArray[i];
        }
        String reversed = new String(reversedChar);
        System.out.println(reversed);
    }
}
