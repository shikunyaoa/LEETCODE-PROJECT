package com.kunyao.code.array;

import java.util.Arrays;

/**
 * @ClassName: ReplaceElements_1299
 * @Author: kunyao
 * @Description: 将每个元素替换为右侧最大元素
 * @Date: 2020/7/3 11:14
 * @Version: 1.0
 */
public class ReplaceElements_1299 {


    public static void main(String[] args) {

        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    /**
     * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
     * 完成所有替换操作后，请你返回这个数组。
     *
     * 输入：arr = [17,18,5,4,6,1]
     * 输出：[18,6,6,6,1,-1]
     * @param arr
     * @return
     */
    public static int[] replaceElements(int[] arr) {

        int max = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(i == arr.length - 1){
                arr[i] = -1;
                continue;
            }

            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }
}
