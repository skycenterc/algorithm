package com.company.algorithm.fundamental;

public class test {
    public static void main(String[] args) {

        System.out.println(gcd(88,132));
        // System.out.println(rank(5, new int[]{2,6,8,10}));
    }

    /**
     * 
     * @param p
     * @param q
     * @return the biggest common divisor of p,q
     */
    public static int gcd(int p , int q){
        if(q == 0) return p;
        int r = p%q;
        return gcd(q, r);
    }

    /**
     * binary search
     * @param key
     * @param a
     * @return get the index of key, if not found return -1
     */
    public static int rank(int key, int[] a){

        return rank(key, a, 0, a.length-1);
    }

    private static int rank(int key, int[] a, int lo, int hi){
        if(lo>hi) return -1;
        int mid = (lo + hi)/2;
        if(key<a[mid])          return rank(key, a, lo, mid -1);
        else if (key > a[mid])  return rank(key, a, mid +1, hi);
        else                    return mid;
    }
}
