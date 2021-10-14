package edu.brown.cs.student.main;

import java.util.List;

/**
 * class Node, which implements INode and represents a node in a KD Tree
 */
public abstract class Node implements INode {
  /**
   * fields for Node
   * - weight: an int, the weight of the current node
   * - height: an int, the height of the current node
   * - age: an int, the age of the current node
   * - parent: a Node, which is the parent of the current Node
   * - leftChild: a Node, which is the left child of the current Node
   * - rightChild: a Node, which is the right child of the current Node
   */
  int weight;
  int height;
  int age;
  Node parent;
  Node leftChild;
  Node rightChild;

  /**
   * Constructor for Node
   *
   * @param w -- int, the weight value
   * @param h -- int, the height value
   * @param a -- int, the age value
   * @param p -- Node, the parent node
   * @param lc -- Node, the left child node
   * @param rc -- Node, the right child node
   *
   */
  public Node(int w, int h, int a, Node p, Node lc, Node rc) {
    this.weight = w;
    this.height = h;
    this.age = a;
    this.parent = p;
    this.leftChild = lc;
    this.rightChild = rc;
  }

  /**
   * Load takes in the SQL filepath and makes a sorted KD Tree from the data
   *
   * @param data -- List of objects, all the objects from the API data
   */
  protected Node load(List<T> data) {
    // sort - by depth we decide if it's sorted by height, weight, and age
    // using recursion to go through
    // KDTree class

    // INode get coordinates method - Array => if depth is 1 -> take index 1 of array of coordinates
    // --> get appropriate coordinate for certain depth (using mod by length of array)

    // parsing data from API is getting an Object - should happen in API Lab
  }

  /**
   * Similar takes in the k and target user ID and outputs a list of k closest neighbor user IDs
   *
   * @param k -- int, the number of neighbors wanted
   * @param tid -- int, the target's user_id
   */
  protected List<Integer> similar(int k, int tid) {
    // nearest neighbor / Euclidean distance under KDTree class
  }

  /**
   * SimilarWHA is the same function as the function above ("similar")
   * but takes in the target weight, height, and age instead of user_id
   *
   * @param k -- int, the number of neighbors wanted
   * @param w -- int, the target's weight
   * @param h -- int, the target's height
   * @param a -- int, the target's age
   */
  protected List<Integer> similarWHA(int k, int w, int h, int a) {
    //
  }

  /**
   * Classify takes in the k and target user ID and prints the horoscope distribution of
   * the k closest neighbor user IDs in the form of "Aries: 0 /n Taurus: 1 /n ..."
   *
   * @param k -- int, the number of neighbors wanted
   * @param tid -- int, the target's user_id
   */
  protected String classify(int k, int tid) {
    //
  }


  /**
   * ClassifyWHA takes in the k and target weight, height, and age and prints the horoscope
   * distribution of the k closest neighbor user IDs in the form of "Aries: 0 /n Taurus: 1 /n ..."
   *
   * @param k -- int, the number of neighbors wanted
   * @param w -- int, the target's weight
   * @param h -- int, the target's height
   * @param a -- int, the target's age
   */
  protected String classifyWHA(int k, int w, int h, int a) {
    //
  }

  /**
   * toString converts the result of similar or similarWHA (which are lists of ints) into a string
   * that is printed in the end and shown to the user
   */
  public String toString {
    //
  }

  @Override
  public INode getLeftChild(INode target) {
    return this.leftChild;
  }

  @Override
  public INode getRightChild(INode target) {
    return this.rightChild;
  }

  @Override
  public INode getParent(INode target) {
    return this.parent;
  }

  @Override
  public List<Integer> getValue(Node target){
    List<Integer> result = new List<Integer>;
    result.add(this.weight);
    result.add(this.height);
    result.add(this.age);

    return result;
  }
}