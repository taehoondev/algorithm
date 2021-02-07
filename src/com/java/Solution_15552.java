package com.java;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_15552 {
    /*
    1. 버퍼리더와 버퍼롸이터 수입
    2. 테스트 케이스인 T 인트로 바꿔수입
    3. for문 이용해서 스트링토크나이져로 쪼개기
    4. 넥스트토큰으로 더하기 (인트 로 변환)
    5. 버퍼롸이터로 표현

     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) + "\n");

        }
        br.close();

        bw.flush();
        bw.close();
    }
}
