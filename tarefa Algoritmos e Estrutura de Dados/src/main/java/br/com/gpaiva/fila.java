package br.com.gpaiva;

import java.util.LinkedList;

class IntQueue{
    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int value){
        elements.addLast(value);
    }

    public Integer dequeue(){
        if (!isEmpty()){
            return elements.removeFirst();
        } else {
            return null;
        }
    }

    public Integer front(){
        if(!isEmpty()){
            return elements.getFirst();
        } else {
            return null;
        
        }
    }

    public Integer rear(){
        if (!isEmpty()){
            return elements.getLast();
        } else {
            return null;
        }
    }

    public boolean isEmpty(){
        return elements.size() == 0;
    }

    public int size(){
        return elements.size();
    }
}
public class fila {
    public static void main(String[] args) {
        IntQueue queue = new IntQueue();

        queue.enqueue(12);
        queue.enqueue(20);
        queue.enqueue(70);

        System.out.println("Tamanho da fila: " + queue.size());


        System.out.println("Elemento na frente: " + queue.front());


        System.out.println("Elemento no fim: " + queue.rear());


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println("Tamanho da fila: " + queue.size());
    }
}
