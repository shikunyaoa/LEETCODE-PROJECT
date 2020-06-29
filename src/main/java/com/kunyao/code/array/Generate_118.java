package com.kunyao.code.array;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Generate_118
 * @Author: kunyao
 * @Description: 杨辉三角
 * @Date: 2020/6/29 17:08
 * @Version: 1.0
 */
public class Generate_118 {

    public static void main(String[] args) {

    }


    /**
     * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        if(numRows == 0){
            return lists;
        }


        lists.add(new ArrayList<>());
        //第一个总是1
        lists.get(0).add(1);


        for (int i = 1; i < numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = lists.get(i - 1);


            row.add(1);

            for (int j = 1; j < i ; j++) {
                row.add(preRow.get(j) + preRow.get(j - 1));
            }

            row.add(1);

            lists.add(row);
        }

        return lists;
    }
}
