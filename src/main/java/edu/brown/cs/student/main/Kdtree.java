package edu.brown.cs.student.main;

import java.lang.*;
import java.util.List;


/**
 * KDTree class, which implements IAttributeDatum (is a type of datum)
 */
public class Kdtree {

  /**
   * fields for KDTree
   * - root: the root of the tree
   * - dim: the dimension of the tree (number of variables)
   * - allNodes: a list of all the nodes to be sorted into the tree
   */

  INode root;
  int dimension;
  List<INode> allNodes;


  /**
   * Constructor for KDTree class
   *
   * @param dim -- the dimension of the KDTree
   * @param inputnodes -- the list of Nodes that will be sorted into the balanced KDTree
   */
  public Kdtree(List<INode> inputnodes, int dim) {
    // take in list of nodes and makes balanced tree - using median of the list as root
    this.dimension = dim;
    this.allNodes = inputnodes;


  }
}