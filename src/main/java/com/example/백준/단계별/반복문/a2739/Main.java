package com.example.백준.단계별.반복문.a2739;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int []array = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(array).forEach(b -> {System.out.println(a + " * " + b+ " = " + a*b);});
    }
}
