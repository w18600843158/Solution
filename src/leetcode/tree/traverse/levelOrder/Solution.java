package leetcode.tree.traverse.levelOrder;
/*
DFS,按层次输出
 */

import java.util.ArrayList;
import java.util.List;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root == null )
            return levels;
        helper(root , 0 );
        return levels;
    }
    public void helper(TreeNode node , int level){
        //初始化当前 level
        if(levels.size() == level)
            levels.add(new ArrayList<Integer>());
        //填充当前 level
        levels.get(level).add(node.val);
        //处理左右子树
        if (node.left !=null )
            helper(node.left , level + 1);
        if (node.right != null)
            helper(node.right , level + 1);
    }

}
