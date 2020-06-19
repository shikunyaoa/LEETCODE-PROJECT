package com.kunyao.code.array;

/**
 * @ClassName: Merge_88
 * @Author: kunyao
 * @Description: 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * @Date: 2020/6/19 17:45
 * @Version: 1.0
 */
public class Merge_88 {

    public static void main(String[] args) {

    }

    /**
     * 输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     *
     * 输出: [1,2,2,3,5,6]
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int insertIndex = m - 1;
        for (int i = 0; i < n ; i++) {
            int insertValue = nums2[i];
            while(insertIndex >= 0 && nums1[insertIndex] > insertValue){
                nums1[insertIndex + 1] = nums1[insertIndex];
                insertIndex--;
            }
            nums1[insertIndex + 1] = insertValue;
        }
    }
}
