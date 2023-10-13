package com.example.백준.단계별.문자열.a27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//문제
//        단어
//        $S$와 정수
//        $i$가 주어졌을 때,
//        $S$의
//        $i$번째 글자를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
//        $S$가 주어진다. 단어의 길이는 최대
//        $1\,000$이다.
//
//        둘째 줄에 정수
//        $i$가 주어진다. (
//        $1 \le i \le \left|S\right|$)
//
//        출력
//         
//        $S$의
//        $i$번째 글자를 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println(S.charAt(i-1));
    }
}