package com.example.백준.단계별.배수와약수.a2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

//문제
//        주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1000 이하의 자연수이다.
//
//        출력
//        주어진 수들 중 소수의 개수를 출력한다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int 종료 = Integer.parseInt(bufferedReader.readLine());
        int 시작 = Integer.parseInt(bufferedReader.readLine());
        int 합계 = 0;
        int 최소 = 0;
        for (int tmp = 시작; tmp >= 종료 && tmp>2; tmp--) {
            boolean 소수 = true;
            합계 += tmp;
            for (int 약수 = 2; 약수 <= Math.sqrt(tmp); 약수++) {
                if (tmp % 약수 == 0) {
                    합계 -= tmp;
                    소수 = false;
                    break;
                }
            }
            if(소수){
                최소 = tmp;
            }
        }
        if(종료 <= 2 && 시작 >= 2){
            합계 += 2;
            최소 = 2;
        }
        if(합계 == 0){
            System.out.println(-1);
            return;
        }
        System.out.println(합계);
        System.out.println(최소);

    }
}