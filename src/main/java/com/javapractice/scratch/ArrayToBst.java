package com.javapractice.scratch;

import java.util.Scanner;

public class ArrayToBst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int length = scanner.nextInt();
            int[] arr = new int[length];
            for (int j = 0; j < length; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(new BST(arr));
        }
    }

}


class BST {
    private class Node {
        Node left;
        Node right;
        int val;
    }
    private Node head;

    public BST(int[] array) {
        head = arrayToBst(array, 0, array.length);
    }

    private Node arrayToBst(int[] array, int start, int end) {
        if (end <= start)
            return null;
        int mid = start + (end - start)/2;
        Node node = new Node();
        node.val = array[mid];
        node.left = arrayToBst(array, start, mid);
        node.right = arrayToBst(array, mid + 1, end);
        return node;
    }

    public String toString() {
        return preOrder(head);
    }

    private String preOrder(Node node) {
        if (node == null) {
            return "";
        } else {
            int val = node.val;
            String left = preOrder(node.left);
            String right = preOrder(node.right);
            return val + (left.isEmpty() ? "" : " " + left) + (right.isEmpty() ? "" : " " + right);
        }
    }
}
