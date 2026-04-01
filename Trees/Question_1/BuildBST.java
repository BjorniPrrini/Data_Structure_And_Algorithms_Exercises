package Trees.Question_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.Predicate;

import Trees.Node;

public class BuildBST<T> extends BaseBinaryTree<T> {
    public BuildBST(){
        this.root = null;
    }

    public BuildBST(Node<T> root){
        this.root = root;
    }

    public int getHeight(){
        if(root == null){
            return 0;
        }
        
        return getHeight(root);
    }

    private int getHeight(Node<T> node){
        if(node == null){
            return 0;
        }

        int rightSide = getHeight(node.right);
        int leftSide = getHeight(node.left);

        return Math.max(rightSide, leftSide) + 1;
    }

    public int countLeaves(){
        if(root == null){
            return 0;
        }
        
        return countLeaves(root);
    }

    private int countLeaves(Node<T> node){
        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return 1;
        }
        
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public void printHeights(){
        if(root == null){
            return;
        }

        printHeights(root);
    }

    private void printHeights(Node<T> node){
        if(node == null){
            return;
        }

        printHeights(node.left);
        System.out.print(getHeight(node) + " ");
        printHeights(node.right);
    }

    public int countIf(Predicate<T> condition){
        if(root == null){
            return 0;
        }

        return countIf(root, condition);
    }

    private int countIf(Node<T> node, Predicate<T> condition){
        if(node == null){
            return 0;
        }

        int count = 0;

        if(condition.test(node.data)){
            count =  1;
        }
        
        return count + countIf(node.right, condition) + countIf(node.left, condition);
    }

    public boolean equals(BuildBST<T> other){
        if(other == null){
            return false;
        }

        return equals(root, other.root);
    }

    private boolean equals(Node<T> a, Node<T> b){
        if(a == null && b == null){
            return true;
        }

        if(a == null || b == null){
            return false;
        }

        if(!a.data.equals(b.data)){
            return false;
        }

        return equals(a.left, b.left) && equals(a.right, b.right);
    }

    public BuildBST<T> clone(){
        if(root == null){
            return null;
        }

        return new BuildBST<>(cloneNode(root));
    }

    private Node<T> cloneNode(Node<T> node){
        if(node == null){
            return null;
        }

        Node<T> newNode = new Node<T>(node.data);

        newNode.left = cloneNode(node.left);
        newNode.right = cloneNode(node.right);

        return newNode;
    }

    public boolean isBalanced(){
        if(root == null){
            return true;
        }

        return checkBalanced(root) != -1;
    }

    private int checkBalanced(Node<T> node){
        if(node == null){
            return 0;
        }

        int left = checkBalanced(node.left);

        if(left == -1){
            return -1;
        }

        int right = checkBalanced(node.right);

        if(right == -1){
            return -1;
        }

        if(Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public boolean isSymmetric(){
        if(root == null){
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(Node<T> a, Node<T> b){
         if(a == null && b == null){
            return true;
        }

        if(a == null || b == null){
            return false;
        }

        if(!a.data.equals(b.data)){
            return false;
        }

        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    public BuildBST<T> generateMirror(){
        if(root == null){
            return null;
        }

        return new BuildBST<>(mirrorNode(root));
    }

    private Node<T> mirrorNode(Node<T> node){
        if(node == null){
            return null;
        }

        Node<T> newNode = new Node<>(node.data);

        newNode.left = mirrorNode(node.right);
        newNode.right = mirrorNode(node.left);

        return newNode;
    }

    public int diameter(){
        int[] diameter = new int[1];

        diameter(root, diameter);

        return diameter[0];
    }

    private int diameter(Node<T> node, int[] maxDiameter){
        if(node == null){
            return 0;
        }

        int leftHeight = diameter(node.left, maxDiameter);
        int rightHeight = diameter(node.right, maxDiameter);

        int currDiameter = leftHeight + rightHeight + 1;

        maxDiameter[0] = Math.max(maxDiameter[0], currDiameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isSubtree(BuildBST<T> sub){
        if(sub == null || sub.root == null){
            return true;
        }

        return isSubtree(root, sub.root);
    }

    private boolean isSubtree(Node<T> treeNode, Node<T> subNode){
        if(treeNode == null){
            return false;
        }

        if(isSameTree(treeNode, subNode)){
            return true;
        }

        return isSubtree(treeNode.left, subNode) || isSubtree(treeNode.right, subNode);
    }

    private boolean isSameTree(Node<T> a, Node<T> b){
        if(a == null && b == null){
            return true;
        }

        if(a == null || b == null){
            return false;
        }

        if(!a.data.equals(b.data)){
            return false;
        }

        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }

    public Node<T> lowestCommonAncestor(T a, T b){
        return lca(root, a, b);
    }

    private Node<T> lca(Node<T> node, T a, T b){
        if(node == null){
            return null;
        }

        if(node.data.equals(a) || node.data.equals(b)){
            return node;
        }

        Node<T> left = lca(node.left, a, b);
        Node<T> right = lca(node.right, a, b);

        if(left != null && right != null){
            return node;
        }

        return (left != null) ? left : right;
    }

    public void inorderIterative(){
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = root;
        
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);

                current = current.left;
            }
        
            current = stack.pop();

            System.out.print(current.data + " ");

            current = current.right;
        }
    }

    public void preorderIterative(){
        if(root == null){
            return;
        }

        Stack<Node<T>> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){
            Node<T> current = stack.pop();

            System.out.print(current.data + " ");

            if(current.right != null){
                stack.push(current.right);
            }

            if(current.left != null){
                stack.push(current.left);
            }
        }
    }

    public void postorderIterative(){
        if(root == null){
            return;
        }

        Stack<Node<T>> stack1 = new Stack<>();
        Stack<Node<T>> stack2 = new Stack<>();

        stack1.push(root);

        while(!stack1.isEmpty()){
            Node<T> current = stack1.pop();

            stack2.push(current);

            if(current.left != null){
                stack1.push(current.left);
            }

            if(current.right != null){
                stack1.push(current.right);
            }
        }

        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().data + " ");
        }
    }

    public void levelOrderIterative(){
        if(root == null){
            return;
        }
    
        Queue<Node<T>> queue = new LinkedList<>();

        queue.offer(root);
    
        while(!queue.isEmpty()){
            Node<T> current = queue.poll();
            System.out.print(current.data + " ");
        
            if(current.left != null){
                queue.offer(current.left);
            }
        
            if(current.right != null){
                queue.offer(current.right);
            }
        }
    }
}