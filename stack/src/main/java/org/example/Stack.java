package org.example;

public class Stack<T> {

    private Node<T> onTop;
    private int size = 0;
    public void push(T data) {
        Node<T> node = new Node<>(data, isEmpty() ? null : onTop);
        this.onTop = node;
        this.size++;
    }
    public T peek(){
        return this.onTop.data;
    }
    public T pop(){
        Node<T> aux = this.onTop;
        if(this.onTop == null){
            return null;
        }
        this.onTop = this.onTop.bellow;
        this.size--;
        return aux.data;
    }
    public boolean isEmpty(){
        return this.onTop == null;
    }
    public int size(){
        return this.size;
    }

    public void clear(){
        this.onTop = null;
        this.size = 0;
    }
    private static class Node<T> {
        public T data;
        public Node<T> bellow;

        public Node(T data, Node<T> bellow) {
            this.data = data;
            this.bellow = bellow;
        }
    }


}
