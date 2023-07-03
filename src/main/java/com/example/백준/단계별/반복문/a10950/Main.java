package com.example.백준.단계별.반복문.a10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0 ; i < T ; i++){
            System.out.println(scanner.nextInt()+scanner.nextInt());
        }
    }
}

