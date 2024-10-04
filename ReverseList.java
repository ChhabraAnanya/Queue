public class ReverseList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse_list(Node head){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;

            prev = curr.next;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printList(Node node){
        while(node!=null){
            System.out.println(" " + node.data);
            node = node.next;

        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        ReverseList reverseList = new ReverseList();
        reverseList.printList(head);

    }
}
