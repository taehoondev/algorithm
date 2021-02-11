package com.java;

import java.io.CharArrayReader;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

/*
1. 문자를 입력받는다.
2. 10개씩 끊어서 출력한다.
 */
public class Soltuion_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
            if (i%10==9) {
                System.out.println();
            }
        }
    }
}
