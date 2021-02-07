package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice_1152 {
    public static void main(String[] args) throws IOException {
        /*
        1. 버퍼리더로 문장 입력받기
        2. 스트링토크나이져로 입력받은문장 특정문자로 쪼개기
        3. 카운트토큰으로 출
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String getSentence = br.readLine();

        StringTokenizer saveToken = new StringTokenizer(getSentence," ");

        System.out.println(saveToken.countTokens());
    }
}
