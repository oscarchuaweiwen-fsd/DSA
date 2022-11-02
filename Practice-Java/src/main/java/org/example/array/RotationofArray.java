package org.example.array;

import java.util.Arrays;

public class RotationofArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int d = 3;

        rotationArr(nums,d, nums.length);
    }

    static void rotationArr(int[] x,int d,int N){
        int[] temp = new int[N];

        int cur = 0;

        for (int i = d; i < N; i++) {
            temp[cur] = x[i];
            cur++;
        }

        for (int i = 0; i < d; i++) {
            temp[cur] = x[i];
            cur++;
        }

        System.out.println(Arrays.toString(temp));


    }
}
