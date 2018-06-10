package com.chgrivas.feedback.core.collections.list.linked;

import com.chgrivas.feedback.core.collections.list.Node;

public class LinkedNode<T> extends Node<T> {

  private LinkedNode<T> previous;
  private LinkedNode<T> next;

  public LinkedNode(T data) {
    super(data);
  }

  public LinkedNode(T data, LinkedNode<T> previous, LinkedNode<T> next) {
    super(data);
    this.previous = previous;
    this.next = next;
  }

  public LinkedNode<T> getPrevious() {
    return previous;
  }

  public void setPrevious(LinkedNode<T> previous) {
    this.previous = previous;
  }

  public LinkedNode<T> getNext() {
    return next;
  }

  public void setNext(LinkedNode<T> next) {
    this.next = next;
  }
}
