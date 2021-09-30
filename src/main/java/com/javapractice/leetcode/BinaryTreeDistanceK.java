package com.javapractice.leetcode;

import java.util.*;

/**
 * Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of all nodes that have a distance k from the target node.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
 * Output: [7,4,1]
 * Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.
 * Example 2:
 *
 * Input: root = [1], target = 1, k = 3
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 500].
 * 0 <= Node.val <= 500
 * All the values Node.val are unique.
 * target is the value of one of the nodes in the tree.
 * 0 <= k <= 1000
 */
public class BinaryTreeDistanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        TreeNode marker = new TreeNode(Integer.MAX_VALUE);
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        Set<TreeNode> visited = new HashSet<>();
        int dist = 0;
        addParents(root, null, target, parents);

        // bfs
        queue.add(target);
        queue.add(marker);
        while (!queue.isEmpty() && dist <= k) {
            TreeNode current = queue.remove();
            if (current == marker) {
                queue.add(marker);
                dist++;
                continue;
            }

            if (dist == k) {
                list.add(current.val);
            }

            if (parents.get(current) != null && !visited.contains(parents.get(current))) {
                queue.add(parents.get(current));
            }
            if (current.left != null && !visited.contains(current.left)) {
                queue.add(current.left);
            }
            if (current.right != null && !visited.contains(current.right)) {
                queue.add(current.right);
            }
            visited.add(current);
        }
        return list;
    }

    private void addParents(TreeNode root, TreeNode parent, TreeNode target, Map<TreeNode, TreeNode> parents) {
        if (root == null) {
            return;
        }
        parents.put(root, parent);
        if (root != target) {
            parent = root;
            addParents(root.left, parent, target, parents);
            addParents(root.right, parent, target, parents);
        }
    }
}
