
public class Insert
{
     private static Node head;
    public static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /*BEGINNING OF THE LIST*/
    /* Inserts a new Node at front of the list. */

    private static void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /*MIDDLE OF THE LIST*/
    /* Inserts a new node after the given prev_node. */

    private static void insertAfter(Node prev_node, int new_data)
    {
        /*Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    /*END OF THE LIST*/
    /* Appends a new node at the end*/
    private static void append(int new_data)
    {

        Node new_node = new Node(new_data);
        //If list is empty make new node as head
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        /*if not null traverse till the end of the node*/
        Node last = head;
        while (last.next != null)
            last = last.next;

        /*Change the next of last node */
        last.next = new_node;

    }


    private static void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args)
    {

        append(6);
        push(7);
        push(1);
        append(4);
        insertAfter(head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        printList();
    }
}

