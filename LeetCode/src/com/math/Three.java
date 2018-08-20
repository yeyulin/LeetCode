package com.math;

/**
 * 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 */
public class Three {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        while(n%3 == 0){
            n /= 3;
        }
        if(n == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Three three=new Three();
        boolean powerOfThree = three.isPowerOfThree(27);
        System.out.println(powerOfThree);
    }
}
