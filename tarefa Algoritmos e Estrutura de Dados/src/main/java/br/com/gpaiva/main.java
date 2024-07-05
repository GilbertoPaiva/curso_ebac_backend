package br.com.gpaiva;
class LinkedList {
    private Node head;
    private int size;


    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public LinkedList() {
        head = null;
        size = 0;
    }


    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }


    public Node pop() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = null;
        size--;
        return temp;
    }


    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }


    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    public int size() {
        return size;
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(3));

        System.out.println("Lista atual:");
        list.printList();

        list.pop();
        System.out.println("Depois de pop:");
        list.printList();

        list.insert(1, new Node(4));
        System.out.println("Depois de inserir 4 na posição 1:");
        list.printList();

        list.remove(1);
        System.out.println("Depois de remover o nó na posição 1:");
        list.printList();

        System.out.println("Elemento na posição 1: " + list.elementAt(1).value);
        System.out.println("Tamanho da lista: " + list.size());
    }
}
