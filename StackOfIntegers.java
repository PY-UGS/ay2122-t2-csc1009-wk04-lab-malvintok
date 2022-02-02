public class StackOfIntegers {
    private int[] elements;
    private int size;
    private int top;
    private int popValue;

    public StackOfIntegers() {
        elements = new int[16];
        top = -1;
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
        top = -1;
    }

    //public boolean empty() {}

    //public int peek() {}

    public void push(int value) {
        if(top == -1) {
            top++;
        }
        elements[top] = value;
        //System.out.println(elements[top]);
        top++;
    }

    public int pop() {
        popValue = elements[top];
        elements[top] = 0;
        top--;
        return popValue;
    }

    public int getSize() {
        return top + 1;
    }
}
