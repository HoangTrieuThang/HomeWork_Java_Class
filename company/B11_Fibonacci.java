package com.company;

import java.util.Scanner;

public class B11_Fibonacci {
    static long fibonacci(int n){
        long f0 = 0;
        long f1=1;
        long fn=0;
        if (n==0||n==1) fn=n;
        else for (int i=2;i<=n;i++){
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        return fn;
    }

    static void display(){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int cout =0;
        for (int i=0;i<=n;i++){
            System.out.println(" "+ fibonacci(i));
            cout++;
            if (cout%10 == 0) System.out.println(" ");
        }
    }

    public static void main(String[] args) {
    display();
    }
}
