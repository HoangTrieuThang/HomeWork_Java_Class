package com.company;

import java.util.Scanner;

public class B13_TinhPi {
    public static void main(String[] args) {
        double c, pi=0, sum = 1;int i=0;
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextDouble();
        while (sum>c){
           sum=1/(2*(double)i+1);
           if(i%2==0) pi+=sum;
           else pi-=sum;
           i++;
        }
        System.out.print(4*pi);
    }
}
