package Stack;
public class Stack {
    int capacity;
    int[] arr;
    int top;
    public Stack(int capacity)
    {
        this.capacity = capacity;
        this.arr = new int[capacity];
        top = -1;
    }

    public boolean isFull(){
        return top == arr.length - 1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow!!");
        }
        else{
            top++;
            arr[top] = data;
        }
    }
    // pop method
    public int pop()
    {
        int t = -1;
        if(isEmpty())
        {
            System.out.println("Empty Stack!!");
        }else{
            t = arr[top];
            top--;
        }
        return t;
    }
    // peek element
    public int peek()
    {
        int t = -1;
        if(isEmpty())
        {
            System.out.println("Stack is Empty!!");
        }
        else{
            t = arr[top];
        }
        return  t;
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Empty Stack!!!");
        }
        else{
            for(int i = arr.length-1; i>=0; i--)
            {
                System.out.println("push() -> "+arr[i]);
            }
        }
    }
}
