import java.util.LinkedList;

public class TugasQueue {
    public static void main(String[] args) {
        LinkedList<integer> queue = new LinkedList<>();
        int[] dataMasuk = {11, 22, 33, 44, 55, 66, 77, 88};

        System.out.println("--- PROSES ENQUEUE ---");
        for (int data : dataMasuk) {
            queue.addLast(data);
            System.out.println("enqueue ke queue: " + data);
        }

        System.out.println("\nIsi Queue SEBELUM proses Dequeue (Front -> Rear):");
        System.out.println(queue);

        System.out.println("\n--- PROSES DEQUEUE ---");
        
        System.out.println("Dequeue dari queue: " + queue.poll());
        System.out.println("Dequeue dari queue: " + queue.poll());

        System.out.println("\nIsi Queue SESUDAH proses Dequeue (Front -> Rear):");
        System.out.println(queue);
    }
}
