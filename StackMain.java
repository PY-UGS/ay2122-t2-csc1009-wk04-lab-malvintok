public class StackMain {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(100);
        for(int i = 0; i < 61; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.print("\n");
    }
}
