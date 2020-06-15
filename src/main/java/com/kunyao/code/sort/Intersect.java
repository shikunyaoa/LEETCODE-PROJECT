package com.kunyao.code.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.jar.Manifest;

/**
 * @ClassName: Intersect
 * @Author: kunyao
 * @Description: 给定两个数组，编写一个函数来计算它们的交集。
 * @Date: 2020/6/15 13:30
 * @Version: 1.0
 */
public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }


    /**
     * 哈希映射
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> m = new HashMap<>();

        for(int n : nums1){
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        int k = 0;
        for(int n : nums2){
            int cn = m.getOrDefault(n, 0);
            if(cn > 0){
                nums1[k++] = n;
                m.put(n, cn - 1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }


    /**
     * 排序
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect2(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                ++i;
            }else if(nums1[i] > nums2[j]){
                ++j;
            }else{
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

}
