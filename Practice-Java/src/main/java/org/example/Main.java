package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,1,1};
        int[] temp = new int[nums.length*2];
        int length = temp.length;
        int k = 0;

        while(--length>=0){
            int mod = k % nums.length;
            k++;
            temp[k-1] = nums[mod];
        }


        System.out.println(Arrays.toString(temp));
    }
}