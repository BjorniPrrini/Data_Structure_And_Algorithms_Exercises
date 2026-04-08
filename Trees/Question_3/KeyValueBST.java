package Trees.Question_3;

public class KeyValueBST<K extends Comparable<K>, V> implements TableInterface<K, V>{
    Node<K, V> root;

    public V get(K key){
        Node<K, V> node = getHelper(root, key);

        if(node == null){
            return null;
        }

        return node.value;
    }

    private Node<K, V> getHelper(Node<K, V> curr, K key){
        if(curr == null){
            return null;
        }

        int compare = key.compareTo(curr.key);

        if(compare == 0){
            return curr;
        }else if(compare < 0){
            return getHelper(curr.left, key);
        }else{
            return getHelper(curr.right, key);
        }
    }

    public void put(K key, V value){
        root = putHelper(root, key, value);
    }

    private Node<K, V> putHelper(Node<K, V> curr, K key, V value){
        if(curr == null){
            return new Node<K, V>(key, value);
        }

        int compare = key.compareTo(curr.key);

        if(compare < 0){
            curr.left = putHelper(curr.left, key, value);
        }else if(compare > 0){
            curr.right = putHelper(curr.right, key, value);
        }else{
            curr.value = value;
        }

        return curr;
    }

    public void remove(K key){
        root = removeHelper(root, key);
    }

    private Node<K, V> removeHelper(Node<K, V> curr, K key){
        if(curr == null){
            return null;
        }

        int compare = key.compareTo(curr.key);

        if(compare < 0){
            curr.left = removeHelper(curr.left, key);
        }else if(compare > 0){
            curr.right = removeHelper(curr.right, key);
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

            Node<K, V> min = findMin(curr.right);

            curr.key = min.key;
            curr.value = min.value;

            curr.right = removeHelper(curr.right, min.key);
        }

        return curr;
    }

    private Node<K, V> findMin(Node<K, V> curr){
        while(curr.left != null){
            curr = curr.left;
        }

        return curr;
    }
}