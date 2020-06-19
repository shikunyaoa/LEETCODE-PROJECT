package com.kunyao.code.array;

/**
 * @ClassName: FindLengthOfLCIS_674
 * @Author: kunyao
 * @Description: 最长连续递增序列
 * 给定一个未经排序的整数数组，找到最长且连续的的递增序列，并返回该序列的长度
 * @Date: 2020/6/19 16:07
 * @Version: 1.0
 */
public class FindLengthOfLCIS_674 {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,2,3,2,3};
        System.out.println(findLengthOfLCIS(arr));

    }

    /**
     * 输入: [1,3,5,4,7]
     *       1,3,4,5,7
     * 输出: 3
     * 解释: 最长连续递增序列是 [1,3,5], 长度为3。
     * @param nums
     * @return
     */

    public static int findLengthOfLCIS(int[] nums) {


        //指定第一个元素为
        //遍历数组判断是


        if(nums.length <= 1){
            return nums.length;
        }

        //最大峰值
        int ans = 1;
        //当前峰值
        int count = 1;

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            ans = count > ans ? count : ans;
        }
        return ans;
    }

}
