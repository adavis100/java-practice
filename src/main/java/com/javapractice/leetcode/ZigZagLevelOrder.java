package com.javapractice.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode marker = new TreeNode(-1);
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> orderList = new ArrayList<>();
        List<Integer> levelList = new ArrayList<>();

        queue.add(root);
        queue.add(marker);

        if (root == null) {
            return orderList;
        }

        while (queue.size() > 0) {
            TreeNode cur = queue.remove();
            if (cur == marker) {
                orderList.add(levelList);
                levelList = new ArrayList<>();
                if (queue.size() > 0) {
                    queue.add(marker);
                }
                continue;
            }
            levelList.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        for (int i = 0; i < orderList.size(); i++) {
            if ( i % 2 != 0) {
                reverse(orderList.get(i));
            }
        }
        return orderList;
    }

    private void reverse(List<Integer> nums) {
        for (int i = 0; i < nums.size() / 2; i++) {
            int tmp = nums.get(i);
            nums.set(i, nums.get(nums.size() - i - 1));
            nums.set(nums.size() - i - 1, tmp);
        }
    }
}
