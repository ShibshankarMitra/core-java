package dsa_algorithms.arrays;

import java.util.Arrays;
import java.util.Stack;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {7, -5, -1, -3, 6, 9, 2, 11, 6, -23};
        Stack<Integer> pos = new Stack<>();
        Stack<Integer> neg = new Stack<>();
        for (int i : arr) {
            if (i >= 0) {
                pos.push(i);
            } else {
                neg.push(i);
            }
        }
        int index = 0;
        while (!pos.isEmpty() || !neg.isEmpty()) {
            if (!pos.isEmpty()) {
                arr[index] = pos.pop();
                index = index + 1;
            }
            if (!neg.isEmpty()) {
                arr[index] = neg.pop();
                index = index + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
