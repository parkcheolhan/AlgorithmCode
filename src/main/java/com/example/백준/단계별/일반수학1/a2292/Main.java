package com.example.백준.단계별.일반수학1.a2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int 숫자 = Integer.parseInt(bufferedReader.readLine());
        int 마지막_숫자 = 1;
        int 카운트 = 0;
        while(true){
            마지막_숫자 = 마지막_숫자 + 6 * 카운트;
            카운트++;
            if(숫자 <= 마지막_숫자)
                break;
        }
        System.out.println(카운트);
    }
}