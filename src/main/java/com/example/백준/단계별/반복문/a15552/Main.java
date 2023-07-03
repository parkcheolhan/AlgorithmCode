package com.example.백준.단계별.반복문.a15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0 ; i < T ; i++){
            String[] strs = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            bufferedWriter.write(a + b + "\n");
        }
        bufferedWriter.flush();
    }
}

