class Circular_queue
{
int arr[];
  int front=-1;
  int rear=-1;
  int curr_size =0;
  int size;
  
  public Circular_queue(int size)
  {
  this.size =size;
  arr = new int[size];
  }
  
  
  // add element
  void enqueue(int data)
  {
    if(curr_size == size)
	{
	System.out.println("	Queue overflow");
	return;
	}
	
	if(curr_size == 0) front =0;
	rear = (rear + 1)%size;
	arr[rear] = data;
	curr_size++;
	System.out.println(data + " inserted");
  }
  
   void dequeue() 
   {
        if (curr_size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }

        System.out.println(arr[front] + " removed");
        front=(front+1)%size;
        curr_size--;

        
        if (front == rear) {
            front = -1;
            rear = -1;
        }
    }
	
	void peek()
	{
	   if (curr_size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
		System.out.println(arr[front]);
	
	}
	
	void display()
	{
	   if (curr_size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
		
		int i =front;
		int elementsPrinted=0;
		while (elementsPrinted < curr_size)
		{
		 System.out.print(arr[i] + " ");
         i = (i + 1) % size;
        elementsPrinted++;
		}
		System.out.println();
	
	}
}

public class CircularQueue_Array
{
public static void main(String[] args)
{

        Circular_queue q = new Circular_queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50); // should be full after this
        q.display();

        q.dequeue();
        q.dequeue();
        q.display();

        q.enqueue(60);
        q.enqueue(70);
        q.display();

        q.enqueue(80); // should show overflow
    }
}

