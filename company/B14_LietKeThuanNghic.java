package com.company;

public class B14_LietKeThuanNghic {

    public static int ThuanNghich(int n){
        int sum=0,t=n;
        while (n>0){
            sum=sum*10+n%10;
            n=n/10;
        }
        if(sum==t) return 1;
        return 0;
    }
    public static int TongSo(int n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            n=n/10;
        }
        if(sum%10==0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        for(int i=100000;i<=999999;i++){
            if (ThuanNghich(i)==1 && TongSo(i)==1 )
                System.out.println(i);
        }
    }
}
