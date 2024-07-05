package br.com.gpaiva;

import java.util.ArrayList;


class Stack{
    private ArrayList<Integer> elements = new ArrayList<>();

    public void push(int element){
        elements.add(element);

}

public Integer pop() {
    if (!isEmpty()) {
        return elements.remove(elements.size() - 1);
    } else {
        return null;
    }
}

public int size(){
        return elements.size();
}

public boolean isEmpty(){
    return elements.size() == 0;
}

public Integer peek(){
        return !isEmpty() ? elements.get(elements.size() - 1) : null;
}

public Integer top(){
        return peek();
}
}



public class pilha {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(44);
        stack.push(90);

        System.out.println("Tamanho da pilha: " + stack.size());

        System.out.println("Elemento no topo: " + stack.top());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Tamanho da pilha: " + stack.size());
    }
}