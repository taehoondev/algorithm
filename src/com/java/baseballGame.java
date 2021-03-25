package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class baseballGame {

    public static int getNumber() {                    //가끔 오류
        Random random = new Random();

        while (true) {
            String randomNumber = String.valueOf(random.nextInt((865) + 123));
            String arrayNumber[] = randomNumber.split("");
            if (!arrayNumber[0].equals(arrayNumber[1]) && !arrayNumber[0].equals(arrayNumber[2]) && !arrayNumber[1].equals(arrayNumber[2])
                    && !arrayNumber[0].equals("0") && !arrayNumber[1].equals("0") && !arrayNumber[2].equals("0")) {
                return Integer.parseInt(randomNumber);
            } else continue;
        }
    }

    public static int inputNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(bufferedReader.readLine());
        return inputNumber;
    }

    public static void printResult() throws IOException {
        String convertedLetter = String.valueOf(getNumber());
        String[] arr1 = convertedLetter.split("");


        while (true) {
            System.out.println("숫자를 입력해주세요 :"+" ");
            String convertedInputnumber = String.valueOf(inputNumber());
            String[] arr2 = convertedInputnumber.split("");

            int countStrike = 0;
            int countBall = 0;
            if (arr1[1].equals(arr2[1])) countStrike++;
            if (arr1[0].equals(arr2[0])) countStrike++;
            if (arr1[2].equals(arr2[2])) countStrike++;

            if (arr1[0].equals(arr2[1])) countBall++;
            if (arr1[0].equals(arr2[2])) countBall++;
            if (arr1[1].equals(arr2[0])) countBall++;
            if (arr1[1].equals(arr2[2])) countBall++;
            if (arr1[2].equals(arr2[1])) countBall++;
            if (arr1[2].equals(arr2[0])) countBall++;
            System.out.println(countStrike + " " + "스트라이크" + " " + countBall + "볼");

            if (countStrike==3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                Scanner scanner = new Scanner(System.in);
                int result = scanner.nextInt();
                if (result==1) {
                    printResult();
                }
                else if (result==2) {
                    System.out.println("게임 종료을 종료하였습니다.");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        getNumber();
        printResult();
    }
}
