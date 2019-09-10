package com.company;

import java.util.Scanner;

public class Bai2_InChuNhat {
        public static void main(String[] args) {
            int n,m;
            System.out.println("Nhap chieu dai, chieu rong hinh chu nhat.");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            m = scanner.nextInt();
            for(int i=0 ; i<m ; i++){
                for(int j=0; j<n; j++){
                    if(i==0||i==m-1||j==0||j==n-1) System.out.println("*");
                    else System.out.println("");
                }
                System.out.println("");
            }
        }
    }
