class Queue
{
  int arr[];
  int front=-1;
  int rear=-1;
  int curr_size =0;
  int size;
  
  public Queue(int size)
  {
  this.size =size;
  arr = new int[size];
  }
  
  
  // add element
  void enqueue(int data)
  {
   if(rear == size -1)
   {
   System.out.println("	Queue overflow");
   }
   if (front == -1) front = 0;

        rear++;
        arr[rear] = data;
        curr_size++;
        System.out.println(data + " inserted");
    }

    //  Remove element 
    public void dequeue() {
        if (curr_size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }

        System.out.println(arr[front] + " removed");
        front++;
        curr_size--;

        // If all elements removed, reset front and rear
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    //  Check if queue is empty
    public boolean isEmpty() {
        return curr_size == 0;
    }

    //  Check if queue is full
    public boolean isFull() {
        return rear ==  size - 1;
    }

    // Get current size
    public int getSize() {
        return curr_size;
    }

    
    public void display() {
        if (curr_size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
  public class SimpleQueue_Array {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();     // Output: 10 20 30

        q.dequeue();     // Output: 10 removed
        q.display();     // Output: 20 30

        q.dequeue();     // Output: 20 removed
        q.dequeue();     // Output: 30 removed

        q.dequeue();     
        q.display();  
    }
}
