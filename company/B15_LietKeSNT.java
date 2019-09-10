package com.company;

public class B15_LietKeSNT {
    public static int KTNT(int n){
        if (n<2) return 0;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return 0;
        }
        return 1;
    }
    public static int KtraChuSo(int n){
        int sum=0;
        while (n>0){
            sum=n%10;
            if (sum!=0||sum!=6||sum!=8)
                return 0;
            n=n/10;
        }
        return 1;
    }
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
        for (int i=1000000;i<=999999999;i++){
            if (KTNT(i)==1 && ThuanNghich(i) ==1) System.out.println(i);
        }
    }
}
