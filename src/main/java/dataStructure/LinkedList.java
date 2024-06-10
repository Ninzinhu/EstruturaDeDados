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

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        // Recebe a informação(Data), tamnaho da lista vai ser 1 e terei a cabeça e a cauda apontando para o unico nó da Lista (NewNode)
    }


    // Métodos
    public void getHead(){
        if (this.head == null){
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Head: " + head.data);
        }

    }

    public void getTail(){
        if (this.tail == null){
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Tail: " + tail.data);
        }

    }

    public void getLegth(){
        System.out.println("Length: " + this.length);

    }

    public void makeEmpty(){
        // Apontando os 2 métodos para Null
        head = null;
        tail = null;
        length = 0; // Indicando que o tamanho da lista agora é 0
    }

}
