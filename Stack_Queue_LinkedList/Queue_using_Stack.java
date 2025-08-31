package Stack_Queue_LinkedList;


import java.util.Stack;

class QueueUsingOneStack {
    Stack<Integer> s = new Stack<>();

    // Enqueue is simple
    public void enqueue(int x) {
        s.push(x);
    }

    // Dequeue using recursion
    public int dequeue() {
        if (s.isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }

        int x = s.pop();

        if (s.isEmpty()) {
            return x; // This was the first inserted element
        }

        int result = dequeue();  // recursive call
        s.push(x); // put back
        return result;
    }

    public static void main(String[] args) {
        QueueUsingOneStack q = new QueueUsingOneStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeue: " + q.dequeue()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // 20
    }
}
