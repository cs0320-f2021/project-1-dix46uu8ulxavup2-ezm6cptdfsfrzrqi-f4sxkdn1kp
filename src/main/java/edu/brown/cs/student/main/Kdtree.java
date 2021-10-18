package edu.brown.cs.student.main;

import java.lang.*;
import java.util.List;


/**
 * KDTree class
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
    this.dimension = dim;
    this.allNodes = inputnodes;
  }

  /** 
   * Recursive function with changing dimensions 
   * 
   * @param dim -- the dimension of the tree
   * @param level -- the current level that the construction is on
   * @param madeTree -- the currently made tree - in order to keep track of how 
   *                    far the construction is 
   * 
   * @return -- the sorted version of the KD Tree
   */
  public List<INode> SortedKDtree(int level, List<INode> madeTree){
    int dim = this.dimension;
    List<INode> nodes = this.allNodes; 
    List<INode> unsorted = allNodes.subList(List.length(madeTree), List.length(allNodes));

    if (List.length(this.allNodes) == List.length(madeTree)){
      return madeTree;
    } else {
      Comparator<INode> byLevel
          = Comparator.comparingDouble(value -> value.getCoordinateVal(level));

      unsorted.sort(byLevel);


      int median = List.length(this.unsorted) / 2;

      INode middleNode = unsorted.get(median);
      List<List<INode>> splitTree = Utils.splitList(unsorted, median);

      List<List<INode>> leftTree = splitTree.get(0);
      List<List<INode>> rightTree = splitTree.get(1);

      //List<INode> newTree = sort.(splitTree);


      // finding level
      int nextLevel;
      if (level + 1 > dim) {
        nextLevel = 1;
      } else {
        nextLevel = level + 1;
      }

      return SortedKDtree(nextLevel, newTree);
    }
  }
}