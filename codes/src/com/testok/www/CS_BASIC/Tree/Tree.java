package com.testok.www.CS_BASIC.Tree;

public class Tree<E extends Comparable> {
    private E value;
    private Tree<E> left;
    private Tree<E> right;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Tree<E> getLeft() {
        return left;
    }

    public void setLeft(Tree<E> left) {
        this.left = left;
    }

    public Tree<E> getRight() {
        return right;
    }

    public void setRight(Tree<E> right) {
        this.right = right;
    }
}
