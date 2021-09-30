package com.javapractice.scratch;

import java.io.*;
import java.util.Objects;

/**
 * Problem: Serialize and deserialize a binary tree.
 */
public class SerializeBinaryTree implements Serializable {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int aVal) {
            val = aVal;
        }
    }
    transient Node head;

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        writeTree(head, os);
    }

    private void writeTree(Node current, ObjectOutputStream os) throws IOException {
        if (current == null) {
            os.writeInt(Integer.MIN_VALUE);
            return;
        }
        os.writeInt(current.val);
        writeTree(current.left, os);
        writeTree(current.right, os);
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        head = readTree(is);
    }

    private Node readTree(ObjectInputStream is) throws IOException {
        int val = is.readInt();
        if (val == Integer.MIN_VALUE) {
            return null;
        }
        Node node = new Node(val);
        node.left = readTree(is);
        node.right = readTree(is);
        return node;
    }


    public static void main(String[] args) {
        SerializeBinaryTree tree = new SerializeBinaryTree();
        tree.head = new Node(4);
        tree.head.left = new Node(2);
        tree.head.left.left = new Node(1);
        tree.head.left.right = new Node(3);
        tree.head.right = new Node(6);
        tree.head.right.left = new Node(5);
        tree.head.right.right = new Node(7);

        try (FileOutputStream fos = new FileOutputStream("/tmp/tree");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerializeBinaryTree newTree = null;
        try (FileInputStream fis = new FileInputStream("/tmp/tree");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            newTree = (SerializeBinaryTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(newTree.head.val);
        System.out.println(newTree.head.left.val + " " + newTree.head.right.val);
        System.out.println(newTree.head.left.left.val + " " + newTree.head.left.right.val + " " + newTree.head.right.left.val + " " + newTree.head.right.right.val);
    }
}
