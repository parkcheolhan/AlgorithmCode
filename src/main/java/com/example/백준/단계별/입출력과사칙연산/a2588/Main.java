package com.example.백준.단계별.입출력과사칙연산.a2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        String b;
        a = scanner.nextInt();
        b = scanner.next();
        System.out.println(a* Character.getNumericValue(b.charAt(2)));
        System.out.println(a* Character.getNumericValue(b.charAt(1)));
        System.out.println(a* Character.getNumericValue(b.charAt(0)));
        System.out.println(a*Integer.valueOf(b));
    }
}
