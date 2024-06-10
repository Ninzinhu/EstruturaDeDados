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

    // Método GetLast
    public void getLast() {
        if (last != null) {
            System.out.println(" Last: " + last.value);
        } else {
            System.out.println("A fila está vazia");
        }
    }

    // Método GetLenght
    private void getLength() {
        System.out.println("Length: " + lenght);
    }

    // Método Print
    public void print() {
        System.out.println("----------------------------------");
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("----------------------------------");
    }

    // Método Enfileirar
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (lenght == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        lenght++;
    }

    // Método Desenfileirar

    public Node dequeue() {
        if (lenght == 0) return null;
        Node temp = first;
        if (lenght == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        lenght++;
        return temp;
    }


    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        myQueue.print();



//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//
//        myQueue.print();
    }


}
