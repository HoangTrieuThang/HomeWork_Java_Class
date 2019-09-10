package com.company;

import java.util.Scanner;

public class B4_TogChan_Le {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n");
        n = scanner.nextInt();
        int i,sum=0;
        if(n%2==0){
            for(i = 0; i<=n; i+=2)
                sum+=i;
        }
        else{
            for(i = 0; i<=n; i+=2)
                sum+=i;
        }
        System.out.println(sum);
    }
}
