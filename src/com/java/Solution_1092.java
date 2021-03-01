package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        String y = bufferedReader.readLine();
        String[] arr = y.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int day=1;

        while (day%a!=0 || day%b!=0 || day%c!=0) {
            day++;
            if (day%a==0 && day%b==0 && day%c==0) {
                System.out.println(day);
                break;
            }
        }
    }
}
