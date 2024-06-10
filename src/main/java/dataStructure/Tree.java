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
            Node newNode = new Node(value)
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

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        System.out.println(tree.root);
        System.out.println(tree.root.left);
        System.out.println(tree.root.right);
    }


}
