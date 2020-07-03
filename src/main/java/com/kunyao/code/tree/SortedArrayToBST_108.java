package com.kunyao.code.tree;

/**
 * @ClassName: SortedArrayToBST_108
 * @Author: kunyao
 * @Description: 将有序数组转换为二叉搜索树
 * @Date: 2020/7/3 16:35
 * @Version: 1.0
 */
public class SortedArrayToBST_108 {

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        TreeNodes root = sortedArrayToBST(arr);
        root.preOrder();
    }



    public static TreeNodes sortedArrayToBST(int[] nums) {
        BinarySearchTree tree = new BinarySearchTree(new TreeNodes(0));
        for (int i = 0; i < nums.length ; i++) {
            tree.add(new TreeNodes(nums[i]));
        }
        return tree.root;
    }


    public static TreeNodes sortedArrayToBST2(int[] nums){
        return helper(nums, 0, nums.length - 1);
    }

    private static TreeNodes helper(int[] nums, int left, int right) {
        if(left > right){
            return null;
        }

        int mid = (left + right) / 2;
        TreeNodes root = new TreeNodes(nums[mid]);
        root.left =  helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}

class BinarySearchTree{
    TreeNodes root;

    public BinarySearchTree(TreeNodes root) {
        this.root = root;
    }

    public void add(TreeNodes node){
        if(root == null){
            root = node;
        }else{
            root.add(node);
        }
    }

    public void preOrder(){
        if(root == null){
            return;
        }
        root.preOrder();
    }
}

class TreeNodes{
    int val;
    TreeNodes left;
    TreeNodes right;

    public TreeNodes(int val) {
        this.val = val;
    }


    public void add(TreeNodes node){
        if(node == null){
            return;
        }

        if(node.val < this.val){
            if(this.left == null){
                this.left = node;
            }else{
                this.left.add(node);
            }

        }else{
            if(this.right == null){
                this.right = node;
            }else{
                this.right.add(node);
            }
        }
    }

    public void preOrder(){

        if(this.left != null){
            this.left.preOrder();
        }
        System.out.println(this.val);
        if(this.right != null){
            this.right.preOrder();
        }
    }

    @Override
    public String toString() {
        return "TreeNodes{" +
                "val=" + val +
                '}';
    }
}
