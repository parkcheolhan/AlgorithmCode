package com.example.백준.단계별.조건문.a14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a,b,c;
        int x,y;
        a = scanner.next();
        b = scanner.next();
        c = a+b;
        x = c.indexOf("-");
        y = c.lastIndexOf("-");
        System.out.println(x==-1 ? 1 : x > 0 ? 4 : x == y ? 2 : 3);
    }
}
