package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class B10_LietKeSNT {
    static boolean isNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static void display() {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int i = 2, count = 0;
        while (count < num) {
            if (isNguyenTo(i)) {
                System.out.println(" " + i);
                count++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        display();
    }
}
