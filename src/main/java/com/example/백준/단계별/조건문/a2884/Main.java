package com.example.백준.단계별.조건문.a2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H,M,R;
        H = scanner.nextInt() * 60;
        M = scanner.nextInt();
        R = H+M-45;
        R = R >= 0 ? R : 1440+R;
        System.out.println(R/60 + " " + R%60);
    }
}
