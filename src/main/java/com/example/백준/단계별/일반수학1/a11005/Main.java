package com.example.백준.단계별.일반수학1.a11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제
//        10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
//
//        10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
//
//        A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
//
//        입력
//        첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.
//
//        출력
//        첫째 줄에 10진법 수 N을 B진법으로 출력한다.
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bufferedReader.readLine().split(" ");
        int 변환할_숫자 = Integer.parseInt(strs[0]);
        int 진법 = Integer.parseInt(strs[1]);
        String 결과;
        if(진법 != 10){
            StringBuffer stringBuffer =new StringBuffer();
            while(변환할_숫자>0){
                int 값= 변환할_숫자%진법;
                String 자릿수;
                if(값 > 9){
                    char 수 = (char) ('A' - 10 + 값);
                    자릿수 = String.valueOf(수);
                }else {
                    자릿수 = String.valueOf(값);
                }
                stringBuffer.append(자릿수);
                변환할_숫자 = 변환할_숫자 / 진법;
            }
            결과 = stringBuffer.reverse().toString();
        }else {
            결과 = String.valueOf(변환할_숫자);
        }
        System.out.println(결과);
    }
}