package com.company;

import java.util.Scanner;

public class N_2 {
    public static int max(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        if(b>=a && b>=c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in=new java.util.Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt(), c=in.nextInt();
        int d=max(a, b,c);
        System.out.println(d);
    }
}
