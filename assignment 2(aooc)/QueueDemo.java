import java.util.LinkedList;
import java.util.Queue;

class QueueDemo {
    public static void main(String args[]) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        q.remove();

        System.out.println("Acd cdfter Remove: " + q);
    }
}