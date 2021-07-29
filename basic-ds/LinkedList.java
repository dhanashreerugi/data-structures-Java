

class LinkedList {

    static class Node
    {
        int data;
        Node next;
    }

    static Node createNewNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;  
        return temp;
    }

    public static void main(String[] args) {
        Node head = createNewNode(1);
        head.next = createNewNode(2);
        head.next.next = createNewNode(3);

        // System.out.println(head);

    }

}