package com.example.백준.단계별.기하_직사각형과_삼각형.a1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//문제
//        한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 x, y, w, h가 주어진다.
//
//        출력
//        첫째 줄에 문제의 정답을 출력한다.
//
//        제한
//        1 ≤ w, h ≤ 1,000
//        1 ≤ x ≤ w-1
//        1 ≤ y ≤ h-1
//        x, y, w, h는 정수
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bufferedReader.readLine().split(" ");
        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);
        int w = Integer.parseInt(strs[2]);
        int h = Integer.parseInt(strs[3]);
        int x변최소길이 = Math.min(x,w -x);
        int y변최소길이 = Math.min(y, h -y);
        System.out.println(Math.min(x변최소길이, y변최소길이));

    }
}

