package com.kunyao.code.array;

/**
 * @ClassName: SearchInsert_35
 * @Author: kunyao
 * @Description: 搜索插入位置
 * @Date: 2020/7/2 17:49
 * @Version: 1.0
 */
public class SearchInsert_35 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};

        System.out.println(searchInsert(arr, 2));
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return nums[left] < target ? left + 1: left;
    }
}
