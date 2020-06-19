package com.kunyao.code.array;

/**
 * @ClassName: RemoveDuplicates_26
 * @Author: kunyao
 * @Description: 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * @Date: 2020/6/19 17:05
 * @Version: 1.0
 */
public class RemoveDuplicates_26 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }


    /**
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     *
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 0;

        for (int i = 1; i < nums.length ; i++) {
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }


        return k + 1;
    }
}
