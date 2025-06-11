package dsa_algorithms.linkedList;

import java.util.LinkedList;
import java.util.List;

public class RightRotateByk {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(9, 8, 7, 6, 5, 4, 4));
        System.out.println("Original LinkedList: " + list);
        rotate(list, 2);
        System.out.println("Rotated LinkedList: " + list);
    }

    public static void rotate(LinkedList<Integer> list, int k) {
        int size = list.size();
        for (int i = 0; i < k; i++) {
            int temp = 0;
            for (int j = size - 1; j >= 0; j--) {
                if (j == size - 1) {
                    temp = list.get(j);
                } else {
                    list.set(j + 1, list.get(j));
                }
            }
            list.set(0, temp);
        }
    }
}
