package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int K = Integer.parseInt(br.readLine().trim());
            String out_ = smallest_number(K);
            System.out.println(out_);
        }
        wr.close();
        br.close();
    }

    static String smallest_number(int K) {
        int i = 0;
        int u = (int) Math.pow(10, K);
        int l = (int) Math.pow(10, K - 1);
//       System.out.println("Lowerlimit-"+l+"UpprLimit- "+u);
        while (l < u) {
            int sum = 0;
            int product = 1;
            List<Integer> digits = getDigts(l);
            for (int d : digits) {
                sum = sum + d;
                product = product * d;

            }
//    	   System.out.println("Number- "+l);
//    	   System.out.println("Sum- "+sum);
//    	   System.out.println("Product- "+product);
//    	   
            l = l + 1;
            if (product >= sum) {
                System.out.println(l - 1);
                break;
            }
        }
        String result = "";
        return result;
    }

    private static List<Integer> getDigts(int l) {
        List<Integer> digits = new ArrayList<Integer>();
        while (l != 0) {
            digits.add(l % 10);
            l = l / 10;
        }
        return digits;
    }
}
