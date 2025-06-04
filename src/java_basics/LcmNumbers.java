package java_basics;

import java.util.ArrayList;
import java.util.List;

public class LcmNumbers {
    public static void main(String[] args) {
        int a = 24;
        int b = 9;
        List<Integer> pfa = getPrimeFactors(a);
        List<Integer> pfb = getPrimeFactors(b);
        List<Integer> common = new ArrayList<>(pfa);
        System.out.println(common);
        common.retainAll(pfb);
        common.stream().min(Integer::compareTo).ifPresent(System.out::println);
    }

    public static List<Integer> getPrimeFactors(int num) {
        List<Integer> pf = new ArrayList<>();
        int i=2;
        while (num > 1) {
            if(num%i==0) {
                pf.add(i);
                num=num/i;
            }
            else {
                i++;
            }
        }
        System.out.println(pf);
        return pf;
    }
}
