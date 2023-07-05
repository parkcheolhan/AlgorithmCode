package com.example.백준.단계별.심화1.a2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//문제
//        예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//        입력
//        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//        출력
//        첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < max; i++) {
            String[] star = new String[max + i];
            Arrays.fill(star," ");
            Arrays.fill(star, max - i-1, max + i, "*");
            System.out.println(Arrays.stream(star).collect(Collectors.joining("")));
        }
        for(int i = max-2; i >= 0; i--){
            String[] star = new String[max + i];
            Arrays.fill(star," ");
            Arrays.fill(star, max - i-1, max + i, "*");
            System.out.println(Arrays.stream(star).collect(Collectors.joining("")));
        }
    }

}