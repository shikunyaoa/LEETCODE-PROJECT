package com.kunyao.code.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Postorder_590
 * @Author: kunyao
 * @Description: N叉树的后序遍历
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * @Date: 2020/6/22 17:27
 * @Version: 1.0
 */
public class Postorder_590 {

    private List<Integer> res;
    public List<Integer> postorder(Node root) {
        res = new LinkedList<>();
        dfs(root);
        return res;
    }
    private void dfs(Node root) {
        if(root == null) {
            return;
        }
        for(Node child : root.children){
            dfs(child);
        }
        res.add(root.val);
    }


}



class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};