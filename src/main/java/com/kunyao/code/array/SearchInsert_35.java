package com.kunyao.code.array;

/**
 * @ClassName: SearchInsert_35
 * @Author: kunyao
 * @Description: 搜索插入位置
 * @Date: 2020/7/2 17:49
 * @Version: 1.0
 */
public class SearchInsert_35 {


    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {

        if(nums.length == 0){
            return -1;
        }
        int insertIndex = nums.length - 1;
        int insertVal = target;
        while(insertIndex >= 0 && insertVal < nums[insertIndex]){
            //将有序表的容量加一
            nums[insertIndex + 1] = nums[insertIndex];

            insertIndex--;
        }
        return insertIndex;
    }
}
