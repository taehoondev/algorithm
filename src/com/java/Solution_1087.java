package com.java;

import java.io.*;

public class Solution_1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String getNumber = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int convertedNumber = Integer.parseInt(getNumber);
        int sum=0;

        for (int i = 1; i <= convertedNumber; i++) {
            sum+=i;
            if (convertedNumber<=sum) {
                bufferedWriter.write(String.valueOf(sum));
                bufferedWriter.flush();
                bufferedWriter.close();
                break;
            }
        }
    }
}
