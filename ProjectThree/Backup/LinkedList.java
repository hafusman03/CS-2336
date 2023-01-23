public class LinkedList
{
    private Node<E> head, tail;

    /** Create a default list */

    public MyLinkedList() {}

    public void addFirst(E e)
    {
        Node<E> newNode = new Node<>(e); // create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head point to the new node
        size++; // Increase list size

        if(tail = null) // The new node is the only node in list 
        {
            tail = head;
        }
    }

    
}
