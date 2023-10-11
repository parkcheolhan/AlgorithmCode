//package com.example.백준.단계별.일반수학1.a1193;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
////문제
////        무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
////
////        1/1	1/2	1/3	1/4	1/5	…
////        2/1	2/2	2/3	2/4	…	…
////        3/1	3/2	3/3	…	…	…
////        4/1	4/2	…	…	…	…
////        5/1	…	…	…	…	…
////        …	…	…	…	…	…
////        이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
////
////        X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
////
////        입력
////        첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
////
////        출력
////        첫째 줄에 분수를 출력한다.
//public class Main {
///*
//1
//3
//6
//
// */
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int 숫자 = Integer.parseInt(bufferedReader.readLine());
//        int 기준값 = 1;
//        int 카운트 = 2;
//        int 몫;
//        while(true){
//            if(기준값 < 숫자){
//                기준값 = 기준값 + 카운트;
//                카운트++;
//                continue;
//            }else {
//                int 결과 = 숫자 - 기준값 + 카운트;
//
//
//            }
//            if(카운트 * 카운트 < 숫자){
//                카운트++;
//                continue;
//            }else{
//                숫자/카운트
//            }
//
//        }
//        System.out.println(카운트);
//    }
//}