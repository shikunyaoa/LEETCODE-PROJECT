package com.kunyao.code.array;

import java.awt.font.NumericShaper;
import java.util.Arrays;

/**
 * @ClassName: TwoSum_167
 * @Author: kunyao
 * @Description: 两数之和 II - 输入有序数组
 * @Date: 2020/7/3 13:52
 * @Version: 1.0
 */
public class TwoSum_167 {


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }


    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     *
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     *
     * 说明:
     *
     * 返回的下标值（index1 和 index2）不是从零开始的。
     * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     *
     * 输入: numbers = [2, 7, 11, 15], target = 9
     * 输出: [1,2]
     * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while(numbers[low] + numbers[high] != target){
            if(numbers[low] + numbers[high] < target){
                low++;
            }else if(numbers[low] + numbers[high] > target){
                high--;
            }
        }
        return new int[]{low + 1, high + 1};
    }
}
