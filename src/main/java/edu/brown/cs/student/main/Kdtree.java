
/* REPL */

/*
private void readKdTree(String path) {
    // set up parsing of command line flags
    OptionParser parser = new OptionParser();

    // "./run --gui" will start a web server
    parser.accepts("gui");

    // use "--port <n>" to specify what port on which the server runs
    parser.accepts("port").withRequiredArg().ofType(Integer.class)
    .defaultsTo(DEFAULT_PORT);

    OptionSet options = parser.parse(args);
    if (options.has("gui")) {
    runSparkServer((int) options.valueOf("port"));
    }

    // TODO: Add your REPL here!
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    String input;
    while ((input = br.readLine()) != null) {
    try {
    input = input.trim();
    String[] arguments = input.split(" ");

    // TODO: complete your REPL
    if (arguments.length == 2) {
      */
/*TODO : arguments[1] is the path (type is String) rn so what
         do we store SQL data as and how do we get it

         line below this comment should do that ^ *//*


    Node tree1 = new Node();

    // case for load
    // “users path/to/database.sqlite3 …”
    if (arguments[0].equals("users")) {
    Node tree1 = new Node();
    tree1.load(arguments[1]);
    // TODO :  Have to make a sorted KD Tree here from the input sqlite3 file
    }
    }

    // cases like
    // “similar <k> <some_user_id>”
    // “classify <k> <some_user_id>”
    if (arguments.length == 3) {
    Node tree1 = new Node();
    int k = arguments[1];
    int targetID = arguments[2];

    //similar
    // print k number of closest neighbors’ ids (print sorted : closest -> farthest )
    if (arguments[0].equals("similar")) {
    System.out.println(tree1.toString.similar(k, targetID));
    }

    //classify
    if (arguments[0].equals("classify")) {
    System.out.println(tree1.classify(k, targetID));
    }
    }

    // cases like
    // “similar <k> <weight in lbs> <height in inches> <age in years>”
    // “classify <k> <weight in lbs> <height in inches> <age in years>”
    if (arguments.length == 5) {
    Node tree1 = new Node();
    int k = arguments[1];
    int tWeight = arguments[2];
    int tHeight = arguments[3];
    int tAge = arguments[4];

    //similar
    if (arguments[0].equals("similar")) {
    System.out.println(tree1.toString.similarWHA(k, tWeight, tHeight, tAge));
    }

    //classify
    if (arguments[0].equals("classify")) {
    System.out.println(tree1.classifyWHA(k, tWeight, tHeight, tAge));
    }
    }

    } catch (Exception e) {
    // e.printStackTrace();
    System.out.println("ERROR: We couldn't process your input");
    }
    }
    } catch (Exception e) {
    e.printStackTrace();
    System.out.println("ERROR: Invalid input for REPL");
    }
    }
*/































/* KD Tree */

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
  public <T> getValue(INode target);
}













/**
 * class Node, which implements INode and represents a node in a KD Tree
 */
public class Node implements INode {
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
    //Node or INode

  /**
   * Constructor for Node
   *
   * @param w -- int, the weight value
   * @param h -- int, the height value
   * @param a -- int, the age value
   * @param c -- List<Node>, the children
   *
   */
    public Node(int w, int h, int a, List<Node> c) {
      this.weight = w;
      this.height = h;
      this.age = a;
      //this.children = c;
    }

  /**
   * Load takes in the SQL filepath and makes a sorted KD Tree from the data
   *
   * @param path -- String, the path to the sqlite3 data file
   */
  protected Node load(String path) {

  }

  /**
   * Similar takes in the k and target user ID and outputs a list of k closest neighbor user IDs
   *
   * @param k -- int, the number of neighbors wanted
   * @param tid -- int, the target's user_id
   */
  protected List<Integer> similar(int k, int tid) {

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

  }

  /**
   * Classify takes in the k and target user ID and prints the horoscope distribution of
   * the k closest neighbor user IDs in the form of "Aries: 0 /n Taurus: 1 /n ..."
   *
   * @param k -- int, the number of neighbors wanted
   * @param tid -- int, the target's user_id
   */
  protected String classify(int k, int tid) {
    new List<Integer> result1 = similar(k, tid);

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
    new List<Integer> result1 = similarWHA(k, int w, int h, int a);

  }

  /**
   * toString converts the result of similar or similarWHA (which are lists of ints) into a string
   * that is printed in the end and shown to the user
   */
  public String toString {

  }

  @Override
  public Node getLeftChild(Node target){
    this.leftChild;
  }

  @Override
  public Node getRightChild(Node target){
    this.rightChild;
  }

  @Override
  public Node getParent(Node target){
    this.parent;
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






/// Users.java
import recommender.src.IAttributeDatum;

/**
 * Users class, which implements IAttributeDatum (is a type of datum)
 */
public class Users implements IAttributeDatum {
    /**
     * fields for Users
     * - user_id: Integer ID uniquely identifying a user
     * - weight: The weight of the user in lbs [###lbs]
     * - bust_size: The bust size of the user, just a string
     * - height: The height of the user in feet and inches [#’##”]
     * - age: Integer age of the user in years
     * - body_type: The body type of the user, just a string
     */
    int user_id;
    int weight;
    int bust_size;
    int height;
    int age;
    String body_type;

    /**
     * Constructor for Users class
     *
     * @param uid -- user_id
     * @param w -- weight
     * @param bs -- bust_size
     * @param h -- height
     * @param a -- age
     * @param bt -- body_type
     *
     */
    public Users( int uid, int w, int bs, int h, int a, String bt) {
      this.user_id = uid;
      this.weight = w;
      this.bust_size = bs;
      this.height = h;
      this.age = a;
      this.body_type = bt;
    }

    @Override
    public Object getValueOf(String attributeName) {
        if (attributeName.equals("user_id")) {
            return this.user_id;
        } else if (attributeName.equals("weight")) {
            return this.weight;
        } else if (attributeName.equals("bust_size")) {
            return this.bust_size;
        } else if (attributeName.equals("height")) {
            return this.height;
        } else if (attributeName.equals("age")) {
            return this.age;
        } else if (attributeName.equals("body_type")) {
          return this.body_type;
        } else {
            throw new RuntimeException("This attribute has not been defined.");
        }
    }



    /// TreeGenerator.java


}