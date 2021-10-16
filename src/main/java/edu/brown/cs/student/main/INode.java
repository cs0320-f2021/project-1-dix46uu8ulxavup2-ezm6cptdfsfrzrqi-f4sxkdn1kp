package edu.brown.cs.student.main;

import java.util.List;

/**
 * Interface INode, which represents a node in the KD Tree
 */
public interface INode {

  /**
   * getLeftChild outputs an INode which is the left child node of the input INode
   */
  public INode getLeftChild(INode target);

  /**
   * getRightChild outputs an INode which is the right child node of the input INode
   */
  public INode getRightChild(INode target);

  /**
   * getParent outputs an INode which is the parent node of the input INode
   */
  public INode getParent(INode target);

  /**
   * getValue outputs a value (of whichever type) which is the value of the input INode
   */
  //public <T> getValue(INode target);

  Node getLeftChild(Node target);

  Node getRightChild(Node target);

  Node getParent(Node target);

  List<Integer> getValue(Node target);
}

