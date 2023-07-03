package com.example.백준.단계별.조건문.a1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a == b ? "==" : (a > b) ? ">" : "<");
    }
}
