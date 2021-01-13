package com.java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Pract_1152 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        StringTokenizer st = new StringTokenizer(message, " ");
        System.out.println(st.countTokens());
    }

}