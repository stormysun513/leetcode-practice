class MyStack {
    public void push(int x) {
        Queue qm = q1.isEmpty() ? q1 : q2;
        Queue qs = q1.isEmpty() ? q2 : q1;

        qm.offer(x);
        while(!qs.isEmpty()) qm.offer(qs.poll());
    }

    public void pop() {
        Queue qs = q1.isEmpty() ? q2 : q1;
        qs.poll();
    }

    public int top() {
        Queue qs = q1.isEmpty() ? q2 : q1;
        return (int)qs.peek();
    }

    public boolean empty() {
        Queue qs = q1.isEmpty() ? q2 : q1;
        return qs.isEmpty();
    }

    Queue q1 = new LinkedList();
    Queue q2 = new LinkedList();
}
