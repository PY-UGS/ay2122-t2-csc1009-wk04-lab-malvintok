public class StackOfIntegers {
    private int[] elements;
    private int size; //top index

    public StackOfIntegers() {
        elements = new int[16];
        size = -1;
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
        size = -1;
    }

    public boolean empty() {
        return size == 0 ? true : false;
    }

    //public int peek() {}

    public void push(int value) {
        if(size == -1) {
            size++;
            elements[size] = value;
            //System.out.print(elements[size] + " ");
            size++;
        } else {
            elements[size] = value;
            //System.out.print(elements[size] + " ");
            size++;
        }
    }

    public int pop() {
        int popValue = elements[size - 1];
        elements[size] = 0;
        size--;
        return popValue;
    }

    public int getSize() {
        return size + 1;
    }
}
