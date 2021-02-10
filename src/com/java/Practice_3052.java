package com.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.Scanner;

/*
1. 10개의 수 입력받는다.
2. 42로 나눈 나머지를 구한다.
3. 서로 다른 값의 개수를 구한다. (hashSet 사용)
 */
public class Practice_3052 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt()%42);
        }
        HashSet<Integer> arr2 = new HashSet<Integer>(arr);
        ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);

        System.out.println(arr3.size());
    }
}
