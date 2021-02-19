package com.java;

import java.util.Scanner;

public class Solution_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int b = Integer.valueOf(a, 16);
        String c = Integer.toOctalString(b);
        System.out.println(c);
    }
}
