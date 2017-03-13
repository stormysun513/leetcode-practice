class MyQueue {
    public void push(int x) {
        while(!main.empty()) aux.push(main.pop());
        aux.push(x);
        while(!aux.empty()) main.push(aux.pop());
    }

    public void pop() {
        main.pop();
    }

    public int peek() {
        return (int)main.peek();
    }

    public boolean empty() {
        return main.empty();
    }

    Stack main = new Stack();
    Stack aux = new Stack();
}
