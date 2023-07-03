package com.example.백준.단계별.조건문.a9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println(a > 89 ? "A" : (a > 79) ? "B" : (a > 69) ? "C" : (a > 59) ? "D" : "F");
    }
}
