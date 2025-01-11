import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sircuit {
    static int[] queue = new int[4];
    static int front = -1;
    static int rear = -1;
    static Scanner sc = new Scanner(System.in);


    static boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    static boolean isEmpty() {
        return front == -1;
    }

    // menambahkan value
    static void enQueue(int value){
        if(isFull()) {
            System.out.println("this queue is full");
        } else {    
            if (isEmpty()){
                front = 0;
            }
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            System.out.println(Arrays.toString(queue));
        }
    }

    // menghapus value 
    static void deQueue() {
        if (isEmpty()) {
            System.out.println("this queue is empty");
        } else {
            int del = queue[front];
            queue[front] = 0;
            if (front == rear ) { // jika true berarti queue is empty
                front = rear = -1;
            } else {
                front = (front + 1) % queue.length;
            }
        }
        System.out.println(Arrays.toString(queue));
    }

    // scan value 
    static void enScan() {
        for (int i = 0; i < queue.length; i++) {
            int[] scan = sc.nextInt();
            queue(scan[i]);
        }
    }

    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        enQueue(5);
        deQueue();
        enQueue(5);

    }
}
   