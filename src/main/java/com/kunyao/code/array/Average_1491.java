package com.kunyao.code.array;

import java.util.Arrays;

/**
 * @ClassName: Average_1491
 * @Author: kunyao
 * @Description: 去掉最低工资和最高工资后的工资平均值
 * @Date: 2020/6/29 16:59
 * @Version: 1.0
 */
public class Average_1491 {

    public static void main(String[] args) {
        int[] arr = {4000,3000,1000,2000};
        double average = average(arr);
        System.out.println(average);
    }

    /**
     * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
     *
     * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
     *
     * @return
     */
    public static double average(int[] salary) {

        Arrays.sort(salary);

        salary[0] = 0;
        salary[salary.length - 1] = 0;

        int sum = 0;

        for(int s : salary){
            sum += s;
        }

        double avg = sum / (salary.length - 2);

        return avg;
    }
}
