package com.company;

import java.util.Scanner;

public class B12_ThuanNghich {
    public static void main(String[] args) {
        int m, n, dao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cac so thuat nghich s6 chu so:");
        for (int i = 100000; i <= 999999; i++) {
            m = i;
            n = i;
            dao = 0;
            while (dao != 0) {
                dao = dao * 1 + n % 10;
                n = n / 10;
            }
            if (dao == m) {
                System.out.println("" +i);
            }
        }
    }
}
