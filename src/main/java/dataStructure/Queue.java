package dataStructure;

public class Queue {

    private Node first;
    private Node last;
    private int lenght;

    public class Node {
        int value;
        Node next;

        // Construtores
        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        lenght++;
    }

    // Métodos
    public void getFirst() {
        if (first != null) {
            System.out.println(" First: " + first.value);
        } else {
            System.out.println("A fila está vazia");
        }
    }

    public void getLast() {
        if (last != null) {
            System.out.println(" Last: " + last.value);
        } else {
            System.out.println("A fila está vazia");
        }
    }

    private void getLength() {
        System.out.println("Length: " + lenght);
    }


}
