import java.util.ArrayList;

/** A Generic Binary Tree Class.
  * @author CS61BL Staff. */

public class BinaryTree<T> {

    /* The root node of the tree. */
    protected TreeNode root;
<<<<<<< HEAD
    protected int Index = 0;
=======
>>>>>>> 19dbd43ee14b8afedef73ce72e8c16923541b77a

    /** Constructs an empty binary tree. */
    public BinaryTree() {
        root = null;
    }

    /** Constructs a binary tree with a given root. 
     *  @param t  TreeNode to use as the root
     */
    public BinaryTree(TreeNode t) {
        root = t;
    }

    /** Represents a node in the binary tree. */
    protected class TreeNode {

        public T item;
        public TreeNode left;
        public TreeNode right;
        public int size = 0;

        public TreeNode(T item) {
            this.item = item;
            left = right = null;
        }

        public TreeNode(T item, TreeNode left, TreeNode right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
        
        /** Use for testing. */
        private void printPreorder() {
            System.out.print(item + " ");
            if (left != null) {
                left.printPreorder();
            }
            if (right != null) {
                right.printPreorder();
            }
        }

        /** Use for testing. */
        private void printInorder() {
            if (left != null) {
                left.printInorder();
            }
            System.out.print(item + " ");
            if (right != null) {
                right.printInorder();
            }
        }
    }

    /* EVERYTHING BELOW IS USED ONLY FOR EXERCISE 5. */

        /** Suggested testing script:

                @Test
                public void treeFormatTest() {
                    BinarySearchTree<String> x = new BinarySearchTree();
                    x.add("C");
                    x.add("A");
                    x.add("E");
                    x.add("B");
                    x.add("D");
                    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                    PrintStream oldOut = System.out;
                    System.setOut(new PrintStream(outContent));
                    BinaryTree.print(x, "x");
                    System.setOut(oldOut);
                    assertEquals(outContent.toString().trim(), 
                            "x in preorder\nC A B E D \nx in inorder\nA B C D E \n\n".trim());
                }

        */

    /** Constructs a binary tree based on a given preorder and inorder. 
     *  @param  pre  ArrayList of keys in preorder
     *  @param  in   ArrayList of keys in inorder
     */
    public BinaryTree(ArrayList<T> pre,  ArrayList<T> in) {
<<<<<<< HEAD
        root = listHelper(pre, in,0,in.size()-1);
=======
        root = listHelper(pre, in);
>>>>>>> 19dbd43ee14b8afedef73ce72e8c16923541b77a
    }
    
    /** A helper method. 
     *  @param  pre  ArrayList of keys in preorder
     *  @param  in   ArrayList of keys in inorder
     *  @return TreeNode with root, left, and right according to pre and in
     */
<<<<<<< HEAD
    private TreeNode listHelper(ArrayList<T> pre,  ArrayList<T> in, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        TreeNode tNode = new TreeNode(pre.get(Index++));
        if (inStart == inEnd) {
            return tNode;
        }
        int inIndex = search(in, inStart, inEnd, tNode.item);
        tNode.left = listHelper(pre, in, inStart, inIndex-1);
        tNode.right = listHelper(pre, in, inIndex+1, inEnd);
        return tNode;
    }

    private int search(ArrayList<T> in, int inStart, int inEnd, T myRootItem) {
        int j = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (in.get(i) == myRootItem) {
                j = i;
            }
        }
        return j;
    }


=======
    private TreeNode listHelper(ArrayList<T> pre,  ArrayList<T> in) { 
        //YOUR CODE HERE
        return null;
    }
    
>>>>>>> 19dbd43ee14b8afedef73ce72e8c16923541b77a
    /** Print the values in the tree in preorder: root value first,
      * then values in the left subtree (in preorder), then values
      * in the right subtree (in preorder). */
    public void printPreorder() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            root.printPreorder();
            System.out.println();
        }
    }

    /** Print the values in the tree in inorder: values in the left
      * subtree first (in inorder), then the root value, then values
      * in the right subtree (in inorder). */
    public void printInorder() {
        if (root == null) {
            System.out.println("(empty tree)");
        } else {
            root.printInorder();
            System.out.println();
        }
    }

    /** Used for testing. */
    protected static void print(BinaryTree<?> t, String description) {
        System.out.println(description + " in preorder");
        t.printPreorder();
        System.out.println(description + " in inorder");
        t.printInorder();
        System.out.println();
    }

}
