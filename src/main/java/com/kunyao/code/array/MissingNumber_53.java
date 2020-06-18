package com.kunyao.code.array;

import sun.nio.cs.ext.MacIceland;

import java.util.jar.Manifest;

/**
 * @ClassName: MissingNumber_53
 * @Author: kunyao
 * @Description: 0～n-1中缺失的数字
 * @Date: 2020/6/18 17:30
 * @Version: 1.0
 */
public class MissingNumber_53 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {


        int target = -1;
        int i;
        for ( i = 0; i < nums.length; i++) {

            if(i != nums[i]){
                target = i;
                break;
            }
        }

        if(target == -1){
            target = nums.length;
        }


        return target;
    }
}
