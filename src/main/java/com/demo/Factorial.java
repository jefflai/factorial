package com.demo;

public class Factorial {
    public static int runIterative(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = n; i > 1; i--) {
                result = result * i;
            }
        }
        return result;
    }
    
    public static int runRecursive(int n) {
        if (n == 1 || n == 0) return 1;
        return runRecursive(n - 1) * n;
    }
}