package com.company;

import java.util.Scanner;

public class B5_TinhTong1DenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N:");
        int n = scanner.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
            sum+=(float) 1/i;
        System.out.printf("Ket qua la : %.2f" , sum);
        }
    }

