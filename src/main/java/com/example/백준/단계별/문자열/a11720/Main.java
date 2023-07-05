package com.example.백준.단계별.문자열.a11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제
//        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//        출력
//        입력으로 주어진 숫자 N개의 합을 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        char[] chrs = bufferedReader.readLine().toCharArray();
        int result = 0;
        for(char chr : chrs){
            result += Integer.valueOf(String.valueOf(chr));
        }
        System.out.println(result);
    }
}