package dataStructure;

public class Stack {

    private Node top;
    private int height;

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
    public void print() {
        System.out.println("-------------------------------------");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("-------------------------------------");

    }

    // Método Push
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // Método Pop
    public Node pop(){
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);

//        myStack.getTop();
//        myStack.getHeight();
//
//        myStack.print();



//        myStack.print();
//        myStack.getTop();
//        myStack.getHeight();


    }

}
