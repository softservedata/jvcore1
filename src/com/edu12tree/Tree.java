package com.edu12tree;

public class Tree {

    private Node2 root = null;
    private int num = 0;

    public Tree() {
        root = null;
        num = 0;
    }

    public Tree(Node2 root) {
        this.root = root;
        num = 1;
    }

    public int getNum() {
        return num;
    }

    public void add(double element) {
        Node2 temp = null;
        Node2 newNode = null;
        if (root == null) {
            root = new Node2(element, null, null);
        } else {
            temp = root;
            while ( ((element < temp.data) && (temp.left != null))
                    || ((element > temp.data) && (temp.right != null)) ) {
                if ((element < temp.data) && (temp.left != null)) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            newNode = new Node2(element, null, null);
            if (element < temp.data) {
                temp.left = newNode;
            } else {
                temp.right = newNode;
            }
        }
        num = num + 1;
    }

    public void add(Tree tree) {
        double[] result = tree.getElements();
        for (int i = 0; i < result.length; i++) {
            add(result[i]);
        }
    }

    public double[] getElements() {
        ElementList elementList = new ElementList(num);
        scanTree(root, elementList);
        //
        return elementList.arr;
    }

    private void scanTree(Node2 temp, ElementList elementList) {
        if (temp != null) {
            scanTree(temp.left, elementList);
            elementList.add(temp.data);
            scanTree(temp.right, elementList);
        }
    }

    public double[] getElementsByStack() {
        Node2 temp = null;
        ElementList elementList = new ElementList(num);
        StackNode2 stackNode2 = new StackNode2();
        stackNode2.push(root);
        //
        while (!stackNode2.isEmpty()) {
            temp = stackNode2.pop();
            if (temp.left != null) {
                stackNode2.push(new Node2(temp.data, null, temp.right));
                stackNode2.push(temp.left);
            } else {
                elementList.add(temp.data);
                 if (temp.right != null) {
                    stackNode2.push(temp.right);
                }
            }
        }
        //
        return elementList.arr;
    }
}
