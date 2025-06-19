package coding_problems.basics;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String a = "110";
        String b = "011";

        int i1= Integer.parseInt(a,2);
        int i2= Integer.parseInt(b,2);
        int sum = i1+i2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println(binarySum);
    }
}
