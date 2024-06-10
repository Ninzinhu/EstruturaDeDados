
package dataStructure;

// Binare Search Tree
public class BST {

    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        // Construtor
        public Node(int value) {
            this.value = value;
        }
    }
    // Métodos

    // Método de Inserir
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    // Inserção de forma recursiva
    private void insert(final Node root, final int value) {
        if (root == null) return;
        if (value == root.value) return;
        if (value > root.value) {
            if (root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        } else {
            if (root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
    }

    // Método InOrder
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(final Node node) {
        // E R D (Esquerda,raiz, direita)
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);

    }


    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);

        tree.inOrder();

    }
}
