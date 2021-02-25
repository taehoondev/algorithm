package com.java;

import java.util.Scanner;

public class Solution_1083 {
    public static void main(String[] args) {
        /*
        1. 스캐너로 숫자 입력받는다.
        2. 1부터 입력받은 숫자를 출력한다.
        3. 3의 배수는 X로 출력한다.
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {

            if (i%3==0) {
                System.out.print('X'+" ");
            } else
            System.out.print(i+" ");

        }
    }
}
