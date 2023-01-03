package com.skbeton.skbeton.service.calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int res = 0;

        if(s == 1) res = 0;
        else if (s == 2) res = 1;
        else if (s == 4) res = 2;
        else
            while(s >= 1) {
                res++;
                s /= 2;
            }
        System.out.print(res);
    }
}
