package com.kunyao.code.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: CountCharacters_1160
 * @Author: kunyao
 * @Description: 拼写单词
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 * @Date: 2020/6/28 17:39
 * @Version: 1.0
 */
public class CountCharacters_1160 {

    public static void main(String[] args) {

    }


    /**
     *
     * @param words
     * @param chars
     * @return
     */
    public static int countCharacters(String[] words, String chars) {

        Map<Character, Integer> map = new HashMap<>();

        for(char c : chars.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        Map<Character, Integer> tempMap;
        int length = 0;
        for(String word : words){

            boolean flag = true;
            tempMap = new HashMap<>();
            for(char w : word.toCharArray()){
                int count = tempMap.getOrDefault(w, 0) + 1;
                if(count > map.getOrDefault(w, 0)){
                    flag = false;
                    break;
                }

                tempMap.put(w, count);
            }

            if(flag){
                length += word.length();
            }
        }

        return length;
    }
}
