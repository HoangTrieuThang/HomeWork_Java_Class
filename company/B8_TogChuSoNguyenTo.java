package com.company;

import java.util.Scanner;

public class B8_TogChuSoNguyenTo {
    public static void main(String[] args) {
        int n,tong=0;
        System.out.println("Nhap Vao So nguyen to :");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n>0){
            tong+=n%10;
            n=n/10;
        }
        System.out.println("Tong cua cac chu so: " +tong);
    }
}
