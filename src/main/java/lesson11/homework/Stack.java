package lesson11.homework;

public class Stack implements IStack {
    private int stackSize;
    private int[] stack;
    private int top;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stack = new int[this.stackSize];
        this.top = -1;
    }

    public void push(int element) {
        stack[++top] = element;
    }

    public int pop() {
        return (stack[top--]);
    }

    public int top() {
        return (stack[top]);
    }

    public int isEmpty() {
        if (top == -1) return 1;
        else return 0;
    }

    public int isFull() {
        if (top == stackSize-1) return 1;
        else return 0;
    }
}
