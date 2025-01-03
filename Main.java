import java.util.Scanner;
import java.util.Arrays;

// membuat struktur data Queue
public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[] queue = new int[5];
    static int front = 0;
    static int tail = -1;

    public static void main(String[] args) {
        for (int i = 0; i < queue.length; i++) {
            System.out.print("add value : ");
            int addValue= sc.nextInt();
            enQueue(addValue);
        }

        deQueue();
        deQueue();
        deQueue();
        deQueue();
    }

    static boolean isFull() {
        return tail == queue.length-1;
    }

    static boolean isEmpty() {
        return tail == 0;
    }

    static void enQueue(int value) {
        if (isFull()) {
            System.out.println("this queue is full");
        } else {
            queue[++tail] = value;
            System.out.println(Arrays.toString(queue));
        }
    }

    static void deQueue() {
        if (isEmpty()) {
            System.out.println("this queue is empty");
        } else {
            System.out.println("deQueue");
            queue[tail--] = 0;
            System.out.println(Arrays.toString(queue));
        }
    }
}