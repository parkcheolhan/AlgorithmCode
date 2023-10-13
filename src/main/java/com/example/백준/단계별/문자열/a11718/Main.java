package com.example.백준.단계별.문자열.a11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//문제
//        입력 받은 대로 출력하는 프로그램을 작성하시오.
//
//        입력
//        입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
//
//        출력
//        입력받은 그대로 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 100; i++){
            String str =bufferedReader.readLine();
            if(str == null || str.length() < 1){
                break;
            }
            System.out.println(str);
        }
    }
}