package com.chgrivas.feedback.core.collections.tree;

public class TreeNode<T> {
  private T data;

  private TreeNode left;
  private TreeNode right;

  public static void inOrderTraversal(TreeNode node) {
    if (node != null) {
      inOrderTraversal(node.left);
      visit(node);
      inOrderTraversal(node.right);
    }
  }

  public static void preOrderTraversal(TreeNode node) {
    if (node != null) {
      visit(node);
      preOrderTraversal(node.left);
      preOrderTraversal(node.right);
    }
  }

  public static void visit(TreeNode node) {
    System.out.println(node.data);
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

}
