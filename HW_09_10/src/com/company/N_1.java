package com.company;

import java.util.Scanner;

public class N_1 {
    public static int max(int a, int b){
        if(a>b){
            return a;

        }
        return b;
    }

    public static void main(String[] args) {
	Scanner in=new java.util.Scanner(System.in);
    int a=in.nextInt(), b=in.nextInt();
    int c=max(a, b);
    System.out.println(c);
    }
}
