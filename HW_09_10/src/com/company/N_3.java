package com.company;

import java.util.Scanner;

public class N_3 {
    public static int f(int a){
        return 4*a+60;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(f(10) + f(100) + f(220));
    }
}
