package com.kunyao.code.array;

import java.util.Arrays;

/**
 * @ClassName: NumPairsDivisibleBy60_1010
 * @Author: kunyao
 * @Description: 总持续时间可被 60 整除的歌曲
 * @Date: 2020/7/3 15:20
 * @Version: 1.0
 */
public class NumPairsDivisibleBy60_1010 {

    public static void main(String[] args) {
        int[] arr = {60, 60, 60};
        System.out.println(numPairsDivisibleBy60(arr));
    }


    /**
     * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
     *
     * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，
     * 我们希望索引的数字 i 和 j 满足  i < j 且有 (time[i] + time[j]) % 60 == 0。
     *
         输入：[30,20,150,100,40] [20, 30, 40, 100, 150]
         输出：3
         解释：这三对的总持续时间可被 60 整数：
         (time[0] = 30, time[2] = 150): 总持续时间 180
         (time[1] = 20, time[3] = 100): 总持续时间 120
         (time[1] = 20, time[4] = 40): 总持续时间 60

         来源：力扣（LeetCode）
         链接：https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60
         著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param time
     * @return
     */
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length ; i++) {
            for (int j = i + 1; j < time.length ; j++) {
                if((time[i] + time[j]) % 60 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int numPairsDivisibleBy602(int[] time){
        int count = 0;
        int[] second = new int[60];
        for(int t : time){
            second[t % 60] += 1;
        }

        count += combination(second[30], 2);
        count += combination(second[0], 2);

        int i = 1;
        int j = 59;
        while(i < j){
            count += second[i++] * second[j--];
        }
        return count;
    }

    public static int combination(int n, int k){
        int result = 1;
        for (int i = 1; i <= k ; i++) {
            result = result * (n - i + 1) / i;
        }
        return (int)result;
    }
}
