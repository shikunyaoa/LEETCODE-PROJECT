package com.kunyao.code.binarySearch;

/**
 * @ClassName: BinarySearch
 * @Author: kunyao
 * @Description: 二分查找算法
 * @Date: 2020/6/15 10:35
 * @Version: 1.0
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){

            int mid = (high + low) / 2;
            if(target > nums[mid]){
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
