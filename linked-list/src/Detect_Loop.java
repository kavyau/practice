public class Detect_Loop
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

    private static void push( int new_data)
    {

        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    private static boolean ifLoopExists()
    {
        Node ptr1=head;
        Node ptr2=head;

        while(ptr1!=null && ptr1.next!=null) {
            ptr1 = ptr1.next.next;
            ptr2 = ptr2.next;

            if (ptr1 == ptr2) {
                return true;
            }
        }
        return false;
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

       push(5);
       push(6);
       push(7);
       push(8);
       push(2);

        System.out.println("before loop=");
        printList();

        System.out.println("loop existed-->"+ ifLoopExists());
    }
}
