package dsa_algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr= {1, 1, 1, 3, 3, 2, 2, 1, 4, 3};
        Set<Integer> integers= new HashSet<>();
        for(int i: arr){
            if(integers.contains(i)){
                integers.add(i);
            }
            else {
                integers.add(i);
            }
        }
        System.out.println(integers);
    }
}
