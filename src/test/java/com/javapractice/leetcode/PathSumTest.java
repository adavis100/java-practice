package com.javapractice.leetcode;

import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PathSumTest {
    @Test
    public void solvesExample() throws Exception {
        PathSum pathSum = new PathSum();
/*
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
 */
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.left.left = new TreeNode(11);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.right = new TreeNode(2);
        tree.right = new TreeNode(8);
        tree.right.left = new TreeNode(13);
        tree.right.right = new TreeNode(4);
        tree.right.right.left = new TreeNode(5);
        tree.right.right.right = new TreeNode(1);
        List<List <Integer>> list = pathSum.pathSum(tree, 22);
        /*
        [
            [5,4,11,2],
            [5,8,4,5]
        ]
        */
        assertEquals(list.size(), 2);
        List<Integer> list1 = list.get(0);
        assertTrue(list1.containsAll(Stream.of(5, 4, 11, 2).collect(Collectors.toList())) ||
                list1.containsAll(Stream.of(5, 8, 4, 5).collect(Collectors.toList())));
        List<Integer> list2 = list.get(1);
        assertTrue(list2.containsAll(Stream.of(5, 4, 11, 2).collect(Collectors.toList())) ||
                list2.containsAll(Stream.of(5, 8, 4, 5).collect(Collectors.toList())));
    }

    @Test
    public void handlesAnotherCase() throws Exception {
        PathSum pathSum = new PathSum();
        /*
        [1,-2,-3,1,3,-2,null,-1]
        2
         */
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(-2);
        tree.left.left = new TreeNode(1);
        tree.left.left.left = new TreeNode(-1);
        tree.left.right = new TreeNode(3);
        tree.right = new TreeNode(-3);
        tree.right.left = new TreeNode(-2);
        List<List <Integer>> list = pathSum.pathSum(tree, 2);
        /*
        [
            [1,-2,3]
        ]
        */
        assertEquals(list.size(), 1);
        List<Integer> list1 = list.get(0);
        assertEquals(list1, Stream.of(1, -2, 3).collect(Collectors.toList()));
    }
}
