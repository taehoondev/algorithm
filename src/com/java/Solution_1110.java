package com.java;

import java.util.Scanner;

/*
1. 첫 번째 수 입력 받는다.
2. 각 자릿수 더한다. (예외 만들기 : 한 자리수에 대한)
3. 예 ) 26 -> 68 -> 84 -> 42 -> 26 (총 4 사이클)
4. 사이클 길이 출력
 */
public class Solution_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 첫 번째 수 입력 받는다.
        // for문으로 반복 만들어야 함.
        int count =0;
        int h = n;  //  h = 26  // n = 26

        while (true) {
            int a = h/10; //2     //6
            int b = h%10; //6     //8

            int newNumber = (b*10 + (a+b)%10);    // 68     //84
            h=newNumber;
            count += 1;

            if (newNumber==n)
                break;
        }
        System.out.println(count);
    }
}
