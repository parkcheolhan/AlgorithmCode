package com.example.백준.단계별.일차원배열.a10818;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//문제
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String[] a = bufferedReader.readLine().split(" ");
        List<Integer> stringList = Arrays.stream(a).map(r -> Integer.valueOf(r)).sorted().collect(Collectors.toList());
        System.out.println(stringList.get(0)+ " " + stringList.get(stringList.size()-1));
    }
}