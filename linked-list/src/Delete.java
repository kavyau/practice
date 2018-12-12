public class Delete
{
    private static Node head;
    private static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    private static void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    private static void deleteNode(int key)
    {
        Node temp=head, prev=null;

        if (temp!=null && temp.data==key)
        {
            head=temp.next;
            return;
        }

        while(temp!=null && temp.data!=key)
        {
            prev=temp;
            temp=temp.next;
        }

        if(temp==null)
        {
            return;
        }

        prev.next=temp.next;
    }
    private static void printList()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.println(node.data+" ");
            node=node.next;
        }
    }


    public static void main(String[] args)
    {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        System.out.print("Before deleting=");
        printList();

        deleteNode(30);

        System.out.print("After deleting=");
        printList();


    }

}
