package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution_3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> sett = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            int numbers = sc.nextInt();
            sett.add(numbers%42);
        }

        sc.close();
        System.out.println(sett.size());
    }
}
