package com.example.백준.단계별.기하_직사각형과_삼각형.a27323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//문제
//        정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
//
//
//
//        입력
//        표준 입력에 다음과 같은 형태로 입력이 주어진다.
//
//        A
//        B
//        출력
//        세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
//
//        제한
//        1 ≦ A ≦ 100.
//        1 ≦ B ≦ 100.
//        A, B 는 정수이다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int 세로 = Integer.parseInt(bufferedReader.readLine());
        int 가로 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(세로*가로);

    }
}

