package com.example.백준.단계별.배수와약수.a9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//문제
//        어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
//
//        예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
//
//        n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
//
//        입력
//        입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
//
//        입력의 마지막엔 -1이 주어진다.
//
//        출력
//        테스트케이스 마다 한줄에 하나씩 출력해야 한다.
//
//        n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
//
//        이때, 약수들은 오름차순으로 나열해야 한다.
//
//        n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int 값 = Integer.parseInt(bufferedReader.readLine());
            int 합계 = 0;
            List<Integer> 약수들 = new ArrayList<>();
            if (값 == -1) {
                break;
            }
            for (int i = 1; i <= Math.sqrt(값); i++) {
                if (값 % i == 0) {
                    약수들.add(i);
                    합계 += i;
                    if (i != 1 && 값 / i != i) {
                        약수들.add(값 / i);
                        합계 += 값 / i;
                    }
                }
            }
            if (합계 == 값) {
                IntStream intStream = 약수들.stream().mapToInt(Integer::valueOf);
                String 결과 = intStream.sorted().mapToObj(r -> String.valueOf(r)).collect(Collectors.joining(" + "));
                System.out.println(값 + " = " + 결과);
            } else {
                System.out.println(값 + " is NOT perfect.");
            }
        }
    }

}