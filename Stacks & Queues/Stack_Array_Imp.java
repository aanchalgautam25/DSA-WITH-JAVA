    class Stack {
    int top = -1;
    int size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
		int value = arr[top];
		top--;
        return value;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
	
	void display()
	{
	for(int i=0 ; i<=top; i++)
	{
	 System.out.print(arr[i]+" ");
	}
	}
}
 public class Stack_Array_Imp
 {
 public static void main(String[] args)
 {
 Stack s = new Stack(10);
 s.push(10);
 s.push(20);
 s.push(30);
 s.push(40);
 s.push(50);
 s.pop();
 System.out.println("The top element is : "+s.peek());
 s.push(60);
 s.pop();
 s.pop();
 System.out.println("The top element is : "+s.peek());
 s.display();
 
 
 }
 }
