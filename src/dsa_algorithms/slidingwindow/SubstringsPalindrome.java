package dsa_algorithms.slidingwindow;

public class SubstringsPalindrome {

    static void main() {
        String s= "abcbaba";
        int left=0;
        int count=0;
        while(left<s.length()){
            int right=left;
            while(right<s.length()){
                int start=left;
                int end=right;
                boolean isValid=true;
                while(start<= end){
                    if(!(s.charAt(start)==s.charAt(end))){
                        isValid=false;
                        break;
                    }
                    start++; end--;
                }
                if(isValid){
                    count++;
                    String sub= s.substring(left, right+1);
                    System.out.println(sub);
                }
                right++;
            }
            left++;
        }

        System.out.println(count);
    }

}
