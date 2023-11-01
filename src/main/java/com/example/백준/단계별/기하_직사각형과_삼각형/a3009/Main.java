package com.example.백준.단계별.기하_직사각형과_삼각형.a3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//문제
//        세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
//
//        입력
//        세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
//
//        출력
//        직사각형의 네 번째 점의 좌표를 출력한다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x좌표1, x좌표2 = 0, y좌표1, y좌표2 = 0;
        String[] strs = bufferedReader.readLine().split(" ");
        x좌표1 = Integer.parseInt(strs[0]);
        y좌표1 = Integer.parseInt(strs[1]);
        for(int i = 0 ; i < 2; i ++){
            String[] 좌표들 = bufferedReader.readLine().split(" ");
            if(x좌표1 != Integer.valueOf(좌표들[0])){
                if(x좌표2 != Integer.valueOf(좌표들[0])){
                    x좌표2 = Integer.valueOf(좌표들[0]);
                }else {
                    x좌표2 = 0;
                }
            }else {
                x좌표1 = 0;
            }
            if(y좌표1 != Integer.valueOf(좌표들[1])){
                if(y좌표2 != Integer.valueOf(좌표들[1])){
                    y좌표2 = Integer.valueOf(좌표들[1]);
                }else {
                    y좌표2 = 0;
                }
            }else {
                y좌표1 = 0;
            }
        }
        System.out.println(Math.max(x좌표1, x좌표2)+" "+Math.max(y좌표1, y좌표2));
    }
}

