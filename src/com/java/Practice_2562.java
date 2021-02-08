package com.java;

import javax.xml.stream.Location;
import java.util.Locale;
import java.util.Scanner;

/*
1. 스캐너 사용해서 포문으로 9개 수를 입력받는다. 배열로 입력받는다.
2. 문자로 지정해서 max값을 구한다.
3. 인덱스로 찾는다.
 */
public class Practice_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int location=0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
                location=i;
            }
        }
        System.out.println(max);
        System.out.println(location+1);
    }
}
