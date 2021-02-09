package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
1. 배열로 받아야함

*/
public class Practice_2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        a=Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b=Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        if (a>b) {
            System.out.println(a);
        }
        else System.out.println(b);

    }
}
