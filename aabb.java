
import java.util.Scanner;

public class QueueDs {
    private int size;
    int front,rear,currentSize;
    int[] arr;

    QueueDs(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[this.size];
        this.currentSize =0;

    }

    public void variableWatch(){
        System.out.format("Front: %d \nRear: %d \nCurrent Size: %d \n",front,rear,currentSize);
    }

    public boolean isFull(){
        return (currentSize == size);
    }

    public boolean isEmpty(){

        return (currentSize == 0);
    }

    public void enQueue(int itemToAdd){
        if(!isFull()){
            if(front == -1){
                front = 0;
            }
            rear++;
            if(rear == size){
                rear = 0;
            }
            arr[rear] = itemToAdd;
            currentSize++;
        }else{
            System.out.println("Queue size full!");
        }

    }

    public void deQueue(){
        if(!isEmpty()){
            System.out.println("The item at front is "+arr[front]);
            front++;
            currentSize--;
            if(currentSize == 0){
                front = -1;
                rear = -1;
            }
        }else{
            System.out.println("Que is empty");
        }
    }

    public void peek(){
        System.out.println("The front element is: "+arr[front]);
        System.out.println("The rear element is: "+arr[rear]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the queue you want: ");
        int stSize = in.nextInt();
        QueueDs q = new QueueDs(stSize);
        int choice = 0;

        do {
            System.out.println("1.Exit");
            System.out.println("2.Dequeue");
            System.out.println("3.Enqueue");
            System.out.println("4.Peek");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Program ended!");
                case 3 -> {
                    System.out.println("Enter the number to push:");
                    int uChoice = in.nextInt();
                    q.enQueue(uChoice);
                }
                case 2 -> q.deQueue();
                case 4 -> q.peek();
            }
        }while(choice != 1);


    }
}
Write to COMPUTING (LR12)
