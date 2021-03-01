package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String[] arr = a.split(" ");
        long startNum = Integer.parseInt(arr[0]);

        for (int i = 1; Integer.parseInt(arr[3])-1 >= i; i++) {
            startNum = startNum*Integer.parseInt(arr[1])+Integer.parseInt(arr[2]);
        }
        System.out.println(startNum);
    }
}
