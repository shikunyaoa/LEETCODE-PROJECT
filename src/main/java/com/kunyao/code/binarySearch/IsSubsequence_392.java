package com.kunyao.code.binarySearch;

/**
 * @ClassName: IsSubsequence_392
 * @Author: kunyao
 * @Description: 判断子序列
 *  给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * @Date: 2020/6/17 16:59
 * @Version: 1.0
 */
public class IsSubsequence_392 {

    public static void main(String[] args) {
        String s = "";
        String t = "abcde";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        if(s == null || t == null ||  "".equals(s) || "".equals(t)){
            return false;
        }
        //t 可能很长
        //子序列中的字符和原始字符串中的顺序一致
        int i = 0, j = 0;
        String[] sa = s.split("");
        String[] ta = t.split("");

        while(i < sa.length && j < ta.length){
            if(!sa[i].equals(ta[j])){
                ++j;
            }else{
                ++i;
            }
        }

        if(i == sa.length ){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isSubsequence2(String s, String t) {

        int i = 0;
        for (char ch : s.toCharArray()) {
            while (i < t.length() && t.charAt(i) != ch) {
                i++;
            }
            i++;
        }
        return i <= t.length() ? true : false;

    }
}
