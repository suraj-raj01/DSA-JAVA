package Stack;
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println("Stack is Empty : "+stack.isEmpty());
        System.out.println("Stack is Full : "+stack.isFull());
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(100);
        stack.display();
        System.out.println("Stack is Empty : "+stack.isEmpty());
        System.out.println("Stack is Full : "+stack.isFull());
        System.out.println("Deleted Elements: ");
        System.out.println("pop() -> "+stack.pop());
        System.out.println("pop() -> "+stack.pop());
        System.out.println("pop() -> "+stack.pop());
        System.out.println("Peek Element : "+stack.peek());
        System.out.println("pop() -> "+stack.pop());
        System.out.println("pop() -> "+stack.pop());
        if(stack.peek()==-1)
        {
            System.out.println("Peek Element : null");
        }
    }
}
