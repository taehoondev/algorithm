package com.java;

import java.util.Scanner;

/*
1. n 입력받는다.
- 스캐너 사용하여 입력받는다.
2. n 개의 숫자 입력받는다.
- 문자로 입력받는다.
- charAt 와 for문 사용하여 숫자로 바꾸고 더해준다.
3. 각각의 숫자 더하여 출력한다.

split , 배열 다 더한다.
 */
public class Pract_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;

        while (n>0) {
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
