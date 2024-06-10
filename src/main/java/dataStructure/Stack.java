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
    public void getTop() {
        if (top == null) {
            System.out.println("Pilha Vazia");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    // Altura da Pilha
    public void getHeight() {
        System.out.println("Altura: " + height);
    }


    // Método Print
    public void print(){
        System.out.println("-------------------------------------");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("-------------------------------------");

    }

    public static void main(String[] args)  {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        myStack.print();

    }

}
