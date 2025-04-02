package Arrays;

public class ArrayPattern {

    boolean match(int[] arr1, int[] arr2) {
        boolean b = false;
        int i = 0;
        while (!b) {
            System.out.println("Starting from index- " + i);
            if (arr1[i] == arr2[0]) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i + j] == arr2[j]) {
                        b = true;
                        System.out.println("Mathcing for index" + j);
                        System.out.println(b);

                    } else {
                        System.out.println("Mismatch found");
                        b = false;
                        break;
                    }
                }
            }
            if (i == arr1.length - arr2.length) break;
            else i++;
        }
        return b;
    }

    public static void main(String[] args) {
        ArrayPattern ar = new ArrayPattern();
        int[] arr1 = {1, 3, 4, 5, 2, 3, 4, 8, 5, 9, 1, 2};
        int[] arr2 = {2, 3, 4, 8};
        System.out.println(ar.match(arr1, arr2));
    }
}
