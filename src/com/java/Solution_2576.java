package com.java;

import java.util.*;

public class Solution_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] arr = new int[7];
        List list = new ArrayList();

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 1) {
                list.add(arr[i]);

            }
        }
        for (int i=0; i<list.size(); i++) {
           // sum+=list.get(i);

        }
        Collections.sort(list);
        System.out.println(sum);
        System.out.println(list.get(0));
    }
}
