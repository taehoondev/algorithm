package com.java;
/*
스트링 길이 구한후, 하나씩 뺀다 - = nj, 등등 있으
 */

import java.util.Scanner;

public class Solution_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;

        if (a.contains("c=")) {
            count--;
        }
        if (a.contains("c-")) {
            count--;
        }
        if (a.contains("z=")) {
            count--;
        }
        if (a.contains("dz=")) {
            count-=2;
        }
        if (a.contains("d-")) {
            count--;
        }
        if (a.contains("lj")) {
            count--;
        }
        if (a.contains("nj")) {
            count--;
        }
        if (a.contains("s=")) {
            count--;
        }
        System.out.println(a.length() + count);
    }
}
