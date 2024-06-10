package dataStructure;

public class Stack {

    private Node top;
    private Node height;

    class Node {
        int value;
        Node next;

        // Construtor
        Node(int value) {
            this.value = value;
        }

    }


    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    // Método GetTop
    public void getTop(){
        if (top == null){
            System.out.println("Pilha Vazia");
        } else{
            System.out.println("Topo: " + top.value);
        }
    }


}
