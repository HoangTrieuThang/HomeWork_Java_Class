package com.company;

import java.util.Scanner;

public class B6_UocBoiChung {
    public static void main(String[] args) {
        int s1,s2,temp1,temp2,ucln,bcnn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so bat ky:");
        s1=scanner.nextInt();
        s2=scanner.nextInt();

        while (s1<0||s2<0){
            System.out.println("Nhap sai. Nhap lai:");
            s1=scanner.nextInt();
            s2=scanner.nextInt();
        }
        temp1=s1;
        temp2=s2;
        while (temp1!=temp2){
            if (temp1>temp2){
                temp1-=temp2;
            }else {
                temp2-=temp1;
            }
            ucln=temp1;
            System.out.println("Ước số chung lớn nhất của " + s1 + " và " + s2 + " = " + ucln);
            System.out.println("Bội số chung lớn nhất của " + s1 + " và " + s2 + " = " + ((s1 * s2) / ucln));
        }
    }
}
