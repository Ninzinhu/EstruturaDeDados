package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        // Construtor
        public Node(int value) {
            this.value = value;
        }

        // Método de Indentificação se é uma folha ou não (IsLeaf)
        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    // Método de inserir
    public void insert(int value) {
        if (root == null) root = new Node(value); // Minha Arvores está vazia e agora possui um novo elemento
        else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() > 0) { // Laço de controle ( Enquanto minha fila tiver elementos)
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }

            }
        }
    }


    // Método preOrder
    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(final Node node) {
        // R E D (Raiz,esquerda e direita)
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);

    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);

        System.out.println(tree.root.isLeaf());
        System.out.println(tree.root.right.isLeaf());
    }


}
