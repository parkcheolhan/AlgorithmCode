package com.example.백준.심화.a1051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//문제
//        N×M크기의 직사각형이 있다. 각 칸에는 한 자리 숫자가 적혀 있다. 이 직사각형에서 꼭짓점에 쓰여 있는 수가 모두 같은 가장 큰 정사각형을 찾는 프로그램을 작성하시오. 이때, 정사각형은 행 또는 열에 평행해야 한다.
//
//        입력
//        첫째 줄에 N과 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 수가 주어진다.
//
//        출력
//        첫째 줄에 정답 정사각형의 크기를 출력한다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] 가로세로 = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(r -> Integer.valueOf(r)).toArray();
        int [][] 좌표모음 = new int[가로세로[0]][가로세로[1]];
        int 최대변 = 가로세로[0] < 가로세로[1] ?  가로세로[0] : 가로세로[1];
        int maxLength = 0;
        for(int 세로 =0; 세로 < 가로세로[0]; 세로++){
            좌표모음[세로] =  Arrays.stream(bufferedReader.readLine().split("")).mapToInt(Integer::valueOf).toArray();
        }

        for(int 세로 =0; 세로 <= 가로세로[0] -1 - maxLength; 세로++){
            for(int 가로=0; 가로 < 가로세로[1] -1 - maxLength; 가로++){
                int 가로비교 = (최대변 + 가로) < 가로세로[1] ? (최대변 + 가로) : 가로세로[1];
                for(int 비교=가로비교-1; 비교 > 가로 + maxLength; 비교--){
                    if(세로+비교-가로 >= 가로세로[0]){
                        continue;
                    }
                    int 기준  = 좌표모음[세로][가로];
                    if(기준 == 좌표모음[세로][비교]){
                        if(기준 == 좌표모음[세로+비교-가로][가로]){
                            if(기준 == 좌표모음[세로+비교-가로][비교]){
                                maxLength =  비교 - 가로;
                            }
                        }
                    }
                }
            }
        }
        maxLength++;
        System.out.println(maxLength*maxLength);
    }
}