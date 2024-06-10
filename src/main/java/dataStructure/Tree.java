package dataStructure;

public class Tree {

    public Node root;

    public static class Node{
        public int value;
        public Node left;
        public Node right;

        // Construtor
        public Node(int value){
            this.value = value;
        }
        // Método de Indentificação se é uma folha ou não (IsLeaf)
        public boolean isLeaf(Node node){
            return  (node != null) && (node.left == null) && (node.right == null)
        }
    }





}
