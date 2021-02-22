package com.java;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Solution_1067 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int getNumber = Integer.parseInt(bufferedReader.readLine());
        if (getNumber>0) {
            System.out.println("plus");
        } else System.out.println("minus");

        if (getNumber%2==0) {
            System.out.println("even");
        } else System.out.println("odd");
    }
}
