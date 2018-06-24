package com.chgrivas.feedback.core.collections.tree;

public class MoMultiNode<T> {
  private T data;
  private MoMultiNode[] children;

  public MoMultiNode(T data) {
    this.data =data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public MoMultiNode[] getChildren() {
    return children;
  }

  public void setChildren(MoMultiNode[] children) {
    this.children = children;
  }
}
