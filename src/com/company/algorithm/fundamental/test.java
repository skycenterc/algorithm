package com.company.algorithm.fundamental;

public class test {
    public static void main(String[] args) {
        System.out.println(gcd(132,88));
    }

    public static int gcd(int p , int q){
        if(q == 0) return p;
        int r = p%q;
        return gcd(q, r);
    }
}
