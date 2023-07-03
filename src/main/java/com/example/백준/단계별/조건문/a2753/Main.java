package com.example.백준.단계별.조건문.a2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println((a%4 == 0 && a%100 != 0) || a % 400 == 0  ? 1 : 0);
    }
}
