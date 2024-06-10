package dataStructure;

public class LinkedList {
    // Nossa lista ligada possue 3 campos principais
    private Node head; // Cabeça
    private Node tail; // Cauda
    private int length; // Tamanho da lista


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    // Contrutor

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        // Recebe a informação(Data), tamnaho da lista vai ser 1 e terei a cabeça e a cauda apontando para o unico nó da Lista (NewNode)
    }


    // Métodos
    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Head: " + head.data);
        }

    }

    public void getTail() {
        if (this.tail == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Tail: " + tail.data);
        }

    }

    public void getLegth() {
        System.out.println("Length: " + this.length);

    }

    public void makeEmpty() {
        // Apontando os 2 métodos para Null
        head = null;
        tail = null;
        length = 0; // Indicando que o tamanho da lista agora é 0
    }

    // Método Print
    public void print() {
        System.out.println("_________________________________");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("__________________________________________");
    }

    // Método append
    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Método Remover do final da lista
    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while (pre.next != tail) {
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if (length == 0) {
            head = null;
            tail = null;

        }

        return temp;

    }

    // Método Prepend
    public void prepend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Método Remover do Inicio
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;

        }
        return temp;
    }

    // Operação: Ler de uma posição  método (GET)
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Método Set
    public boolean set(int index, String data) {
        Node temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;

    }

    // Método Insert
    public boolean insert(int index, String data) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    // Método Remove em uma determinada posição
    public Node remov(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("elemento 0");

        list.insert(3, "Elemento 2.5");

//        System.out.println(list.get(2).data);

//       System.out.println(list.removeFirst().data);
//        list.print();
//        list.getHead();
//        list.getTail();
//        list.getLegth();
        list.print();
        list.set(1, "Elemento 0.5");
        list.print();
    }

}
