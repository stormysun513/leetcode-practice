public class MinStack {
    public MinStack() {
        stack = new Stack<>();
        aux = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(aux.empty()){
            aux.push(x);   
        }
        else{
            int top = aux.peek();
            if(x <= top){
                aux.push(x);
            }
            else{
                aux.push(top);
            }
        }
    }

    public void pop() {
        stack.pop();
        aux.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return aux.peek();
    }

    Stack<Integer> stack;
    Stack<Integer> aux;
}
