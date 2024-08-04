package LinkedList.Node;

public class Node {
    private int data;
    Node next;
    public Node()
    {
        data = 0;
        next = null;
    }
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return data;
    }
    public void setNext(Node next)
    {
        this.next = null;
    }
    public Node getNext()
    {
        return next;
    }
    public String toString()
    {
        return " "+data+"-->";
    }
}
