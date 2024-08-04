package LinkedList.Node;

public class LinkedList {
    private Node head;
    private Node next;
    public LinkedList()
    {
        head = null;
    }
    public boolean insert(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = null;
        }
        else{
            // node.next = head;
            node.setNext(head);
        }
        return true;
    }
}
