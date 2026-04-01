package Trees.Question_1;

import Trees.Node;

public class BuildBSTTest {
    public static void main(String[] args) {
        BuildBST<Integer> tree = new BuildBST<>();
        tree.getRoot();

        Node<Integer> root = new Node<>(1);
        root.left          = new Node<>(2);
        root.right         = new Node<>(3);
        root.left.left     = new Node<>(4);
        root.left.right    = new Node<>(5);

        BuildBST<Integer> t = new BuildBST<>(root);

        System.out.print("Inorder:   "); t.inorder();
        System.out.print("Preorder:  "); t.preorder();
        System.out.print("Postorder: "); t.postorder();

        System.out.println("Height: " + t.getHeight());
        System.out.println();

        System.out.println("Leaf count: " + t.countLeaves());
        System.out.println();

        System.out.println("Heights of each node:");
        t.printHeights();
        System.out.println();

        System.out.println("Count nodes: " + t.countIf(x -> x > 3));
        System.out.println("Count nodes: " + t.countIf(x -> x % 2 == 0));
        System.out.println();

        BuildBST<Integer> copy = new BuildBST<>(root);
        System.out.println("Equals same tree: " + t.equals(copy));

        Node<Integer> root2 = new Node<>(1);
        root2.left = new Node<>(9);

        BuildBST<Integer> different = new BuildBST<>(root2);
        System.out.println("Equals different tree: " + t.equals(different));
        System.out.println();

        BuildBST<Integer> cloned = t.clone();
        System.out.println("Cloned tree inorder: ");
        cloned.inorder();

        cloned.getRoot().data = 99;
        System.out.print("after modifying clone: ");
        t.inorder();
        System.out.println();

        System.out.println("Is balanced: " + t.isBalanced());
        Node<Integer> unbalRoot = new Node<>(1);
        unbalRoot.left = new Node<>(2);
        unbalRoot.left.left = new Node<>(3);

        BuildBST<Integer> unbal = new BuildBST<>(unbalRoot);
        System.out.println(unbal.isBalanced());
        System.out.println();

        Node<Integer> symRoot = new Node<>(1);
        symRoot.left = new Node<>(2);
        symRoot.right = new Node<>(2);
        symRoot.left.left = new Node<>(3);
        symRoot.left.right = new Node<>(4);
        symRoot.right.left = new Node<>(4);
        symRoot.right.right = new Node<>(3);

        BuildBST<Integer> symTree = new BuildBST<>(symRoot);
        System.out.println("Symmetric tree: " + symTree.isSymmetric());

        System.out.println("Original tree symmetric: " + t.isSymmetric());
        System.out.println();

        BuildBST<Integer> mirror = t.generateMirror();
        System.out.print("Mirror inorder: ");
        mirror.inorder();
        System.out.println();

        System.out.println("Diameter: " + t.diameter());
        System.out.println();

        Node<Integer> subRoot = new Node<>(2);
        subRoot.left = new Node<>(4);
        subRoot.right = new Node<>(5);
        BuildBST<Integer> sub = new BuildBST<>(subRoot);
        System.out.println("Is subtree?: " + t.isSubtree(sub));

        Node<Integer> notSubRoot = new Node<>(2);
        notSubRoot.left = new Node<>(9);
        BuildBST<Integer> notSub = new BuildBST<>(notSubRoot);
        System.out.println("Is subtree?: " + t.isSubtree(notSub));
        System.out.println();

        Node<Integer> lcaResult = t.lowestCommonAncestor(4, 5);
        System.out.println("LCA: " + (lcaResult != null ? lcaResult.data : "null"));

        Node<Integer> lcaResult2 = t.lowestCommonAncestor(4, 3);
        System.out.println("LCA: " + (lcaResult2 != null ? lcaResult2.data : "null"));
        System.out.println();


        System.out.print("Inorder: "); t.inorderIterative();
        System.out.println();

        System.out.print("Preorder: "); t.preorderIterative();
        System.out.println();

        System.out.print("Postorder: "); t.postorderIterative();
        System.out.println();

        System.out.print("Level order: "); t.levelOrderIterative();
        System.out.println();
    }
}