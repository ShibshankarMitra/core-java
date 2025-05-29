package Sort;

import java.util.Arrays;
import java.util.stream.Collectors;

//It is a pair wise comparison, For every iteration of j we compare the pairs arr[i] and arr[i+1], and shift the larger number right
//loop of j runs from size-1 to 0, so for each iteration we get jth the largest number.
// Time complexity is O(n^2)
public class BubbleSort {
    int[] sort(int[] arr) {
        int size = arr.length;
        for (int j = size - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 8, 2, 9, 1, 0};
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.sort(arr)));
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
