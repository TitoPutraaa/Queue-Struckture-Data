import java.util.Arrays;
import java.util.Scanner;

public class Queue {
    static Scanner sc = new Scanner(System.in);
    static int front = 0;
    static int size = 0;
    static int capacity = 3;
    static int[] queue = new int[capacity];

    public static void main(String[] args) {
        for (int i = 0; i < capacity; i++) {
            System.out.print("add value : ");
            int value = sc.nextInt();
            enQueue(value);
        }
        getFront();
        deQueue();
        deQueue();
        System.out.println(queue[size]);
    }

    static void capacity(int amount) {

    }

    static boolean isFull() {
        return size == capacity;
    }

    static boolean isEmpty() {
        return size == front;
    }

    static void enQueue(int value) {
        if (isFull()) {
            System.out.println("this queue is full");
            return;
        } else {
            queue[size] = value;
            System.out.println(Arrays.toString(queue));
            size++;
        }
    }
    
    static void deQueue() {
        if (isEmpty()) {
            System.out.println("this stach is empty");
            return;
        } else {
            System.out.println("deQueue");
            for (int i = 0; i < size; i++) {
                if (i == size-1) {
                    queue[i] = 0;
                } else {
                    queue[i] = queue[i+1];
                }
            }
            System.out.println(Arrays.toString(queue));
            size--;
        }
    }

    static int getFront() {
        if (isEmpty()) {
        System.out.println("this queue is empty");
        return -1;
        } else {
            System.out.println("Front : " + queue[front]);
            return queue[front];
        }
    }
}
