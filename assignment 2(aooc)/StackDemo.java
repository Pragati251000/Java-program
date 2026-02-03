import java.util.Stack;

class StackDemo {
    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        s.pop();

        System.out.println("After Pop: " + s);
    }
}