package dsa_algorithms;

public class StringCharCountWinnerLooserAlgo {
    public static void main(String[] args) {
        String str = "aabbccdddeffff";
        int[] charCount = new int[26];
        int left = 0;
        int right = 0;
        int maxSize = 0;
        char maxchar=0;
        while (right < str.length()) {
            charCount[str.charAt(right) - 'a'] += 1;
            if (charCount[str.charAt(right) - 'a'] > maxSize) {
                maxSize = charCount[str.charAt(right) - 'a'];
                maxchar = str.charAt(right);
            }
            else if (charCount[str.charAt(right) - 'a'] == maxSize) {
                maxchar= 0;
            }
            right++;
        }
        System.out.println(maxchar);
    }
}
