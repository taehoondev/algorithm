package com.java;

import java.io.*;

public class Solution_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int t = Integer.parseInt(st);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int i = 0; i < t; i++) {
            String a = br.readLine();
            String b = br.readLine();
            int c = Integer.parseInt(st);
            int d = Integer.parseInt(st);
            bw.write(c+d);
        }
        bw.close();
    }
}
