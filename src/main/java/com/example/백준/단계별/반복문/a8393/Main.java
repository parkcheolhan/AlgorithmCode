package com.example.백준.단계별.반복문.a8393;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for(int i = 1 ; i < n+1 ; i++){
            result += i;
        }
        System.out.println(result);
    }
}

