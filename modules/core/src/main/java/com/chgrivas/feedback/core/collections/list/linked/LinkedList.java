package com.chgrivas.feedback.core.collections.list.linked;

import com.chgrivas.feedback.core.collections.list.Node;

import java.util.Optional;

public class LinkedList<T> {

  private LinkedNode<T> firstNode;
  private LinkedNode<T> lastNode;

  public T getFirst() {
    return Optional.ofNullable(firstNode)
        .map(Node::getData)
        .orElse(null);
  }

  public T getLast() {
    return Optional.ofNullable(lastNode)
        .map(Node::getData)
        .orElse(null);
  }

  public void add(T value) {
    LinkedNode<T> newNode = new LinkedNode<T>(value, lastNode, null );

    if (firstNode == null) {
      firstNode = newNode;
      lastNode = newNode;
    } else {
      lastNode.setNext(newNode);
      lastNode = newNode;
    }
  }

}
