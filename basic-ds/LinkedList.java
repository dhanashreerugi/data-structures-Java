

class LinkedList {

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public static Node inserAtHead(Node head, int data)
    {
        if(head == null)
        {
            head = new Node(data);
            return head;
        }
    
        Node n = new Node(data);
        n.data = data;
        n.next = head;
        head = n; 
        return head;
    }

    public static void printLinkedList(Node head)
    {
        while(head !=null )
        {
            System.out.println(head.data);
            head = head.next;
        }
     
    }

    public static void main(String[] args) {
        Node head = null;
      

        // printLinkedList(head);
        head = inserAtHead(head, 10);
        head = inserAtHead(head, 3);
        head = inserAtHead(head, 6);
        head = inserAtHead(head, 1);
        printLinkedList(head);
    }

}