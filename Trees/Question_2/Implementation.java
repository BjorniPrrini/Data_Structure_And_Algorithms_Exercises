package Trees.Question_2;

import Trees.Node;

public class Implementation<T extends Comparable<T>>{
    Node<T> root;
    
    public Node<T> insert(T data){
        root = insertHelper(root, data);

        return root;
    }

    private Node<T> insertHelper(Node<T> curr, T data){
        if(curr == null){
            return new Node<T>(data);
        }

        if(data.compareTo(curr.data) < 0){
            curr.left = insertHelper(curr.left, data);
        }else if(data.compareTo(curr.data) > 0){
            curr.right = insertHelper(curr.right, data);
        }

        return curr;
    }

    public boolean contains(T data){
        boolean contains = containsHelper(root, data);

        return contains;
    }

    private boolean containsHelper(Node<T> curr, T data){
        if(curr == null){
            return false;
        }

        int compare = data.compareTo(curr.data);

        if(compare == 0){
            return true;
        }else if(compare < 0){
            return containsHelper(curr.left, data);
        }else{
            return containsHelper(curr.right, data);
        }
    }

    public void remove(T data){
        root = removeHelper(root, data);
    }

    private Node<T> removeHelper(Node<T> curr, T data){
        if(curr == null){
            return null;
        }

        int compare = data.compareTo(curr.data);

        if(compare < 0){
            curr.left = removeHelper(curr.left, data);
        }else if(compare > 0){
            curr.right = removeHelper(curr.right, data);
        }else{
            if(curr.left == null && curr.right == null){
                return null;
            }

            if(curr.left == null){
                return curr.right;
            }

            if(curr.right == null){
                return curr.left;
            }

            Node<T> min = findMin(curr.right);

            curr.data = min.data;

            curr.right = removeHelper(curr.right, min.data);
        }

        return curr;
    }

    private Node<T> findMin(Node<T> curr){
        while(curr.left != null){
            curr = curr.left;
        }

        return curr;
    }

    public boolean isValid(){
        return isValidHelper(root, null, null);
    }

    private boolean isValidHelper(Node<T> curr, T min, T max){
        if(curr == null){
            return true;
        }

        if(min != null && curr.data.compareTo(min) <= 0){
            return false;
        }

        if(max != null && curr.data.compareTo(max) >= 0){
            return false;
        }

        return isValidHelper(curr.left, min, curr.data) && isValidHelper(curr.right, curr.data, max);
    }

    public int distance(T a, T b){
        if(!contains(a) || !contains(b)){
            return -1;
        }

        Node<T> lca = findLCA(root, a, b);

        int distanceA = distanceFromNode(lca, a);
        int distanceB = distanceFromNode(lca, b);

        return distanceA + distanceB;
    }

    private Node<T> findLCA(Node<T> curr, T a, T b){
        if(curr == null){
            return null;
        }

        if(a.compareTo(curr.data) < 0 && b.compareTo(curr.data) < 0){
            return findLCA(curr.left, a, b);
        }else if(a.compareTo(curr.data) > 0 && b.compareTo(curr.data) > 0){
            return findLCA(curr.right, a, b);
        }

        return curr;
    }

    private int distanceFromNode(Node<T> curr, T data){
        int distance = 0;

        while(curr != null){
            int compare = data.compareTo(curr.data);

            if(compare == 0){
                return distance;
            }else if(compare < 0){
                curr = curr.left;
            }else{
                curr = curr.right;
            }

            distance++;
        }

        return -1;
    }

    public int rootBalanceFactor(){
        if(root == null){
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public void calculateAllBalanceFactors(){
        calculateAllBalanceFactorsHelper(root);
    }

    private void calculateAllBalanceFactorsHelper(Node<T> curr){
        if(curr == null){
            return;
        }

        int balanceFactor = height(curr.left) - height(curr.right);
        System.out.println(curr.data + " -> " + balanceFactor);

        calculateAllBalanceFactorsHelper(curr.left);
        calculateAllBalanceFactorsHelper(curr.right);
    }

    private int height(Node<T> curr){
        if(curr == null){
            return -1;
        }

        return 1 + Math.max(height(curr.left), height(curr.right));
    }
}