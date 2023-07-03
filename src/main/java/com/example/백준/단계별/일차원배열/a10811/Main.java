package com.example.백준.단계별.일차원배열.a10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

//문제
//        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
//
//        도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
//
//        바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//
//        둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
//
//        도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
//
//        출력
//        모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] ballScore = new int[N];
        for(int i = 0; i < ballScore.length; i++){
            ballScore[i] = i+1;
        }
        for(int i =0; i < M; i++){
            String[] IJ =  bufferedReader.readLine().split(" ");
            int I = Integer.parseInt(IJ[0]);
            int J = Integer.parseInt(IJ[1]);
            for(int j =0; I+j < J-j; j++){
                int tmp = ballScore[I+j-1];
                ballScore[I+j-1] = ballScore[J-j-1];
                ballScore[J-j-1] = tmp;
            }
        }
        System.out.println(Arrays.stream(ballScore).mapToObj(r -> String.valueOf(r)).collect(Collectors.joining(" ")));
    }
}