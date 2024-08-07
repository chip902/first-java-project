@SuppressWarnings("unused")
public class Tree {
    public static void main(String[] args) {
        // Tree (Root)
        // Node (value, left child, right child)
        // insert(value)
        // find(value):boolean

        // var current = root;
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(7);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("Done!");
    }
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node=" + value;
        }
    }
    private Node root;
    public void insert(int value){
        var node = new Node(value);

        if (root == null){
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value){
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else{
                if (current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }
}
