package Trees.Question_1;

import Trees.Node;

public abstract class BaseBinaryTree<T> {
    protected Node<T> root;

    public Node<T> getRoot(){
        return root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void inorder(){
        inorderHelper(root);

        System.out.println();
    }

    private void inorderHelper(Node<T> node){
        if(node == null){
            return;
        }

        inorderHelper(node.left);
        System.out.print(node.data + " ");
        inorderHelper(node.right);
    }

    public void preorder(){
        preorderHelper(root);

        System.out.println();
    }

    private void preorderHelper(Node<T> node){
        if (node == null){
            return;
        }

        System.out.print(node.data + " ");
        preorderHelper(node.left);
        preorderHelper(node.right);
    }

    public void postorder(){
        postorderHelper(root);

        System.out.println();
    }

    private void postorderHelper(Node<T> node){
        if(node == null){
            return;
        }

        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.print(node.data + " ");
    }
}