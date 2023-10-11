package com.example.백준.단계별.일반수학1.a2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제
//        B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
//
//        10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
//
//        A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
//
//        입력
//        첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
//
//        B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
//
//        출력
//        첫째 줄에 B진법 수 N을 10진법으로 출력한다.
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bufferedReader.readLine().split(" ");
        char[] 단어들 = strs[0].toCharArray();
        int 진법 = Integer.parseInt(strs[1]);
        long result = 0;
        for(int i = 0; i < 단어들.length; i++){
            long 자릿수 = 단어들.length - i;
            long 지수 = 1;
            for(int j = 0; j<자릿수-1 ;j++){
                지수 = 지수 * 진법;
            }
            if(단어들[i] >= 'A') {
                result += (단어들[i] - 'A' + 10) * 지수;
            }else {
                result += Integer.valueOf(단어들[i]-'0') * 지수;
            }
        }
        System.out.println(result);
    }
}