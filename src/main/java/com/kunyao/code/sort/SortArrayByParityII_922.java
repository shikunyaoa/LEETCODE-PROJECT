package com.kunyao.code.sort;

/**
 * @ClassName: SortArrayByParityII_922
 * @Author: kunyao
 * @Description: 按奇偶排序数组 II
 * @Date: 2020/6/15 14:34
 * @Version: 1.0
 */
public class SortArrayByParityII_922 {


    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2){
            //如果偶数位上的是奇数，则找到奇数位上是偶数的进行交换
            //否则不进行任何操作
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1){
                    j += 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }

}
