class Node<G>{
        G val;
        Node<G> next;
        Node<G> previous;
        public Node(G val){
            this.val = val;
            this.next = null;
            this.previous = null;
        }
    }
public class LinkedList{
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);

        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);

        head.next = n1;
        n1.previous = head;

        n1.next = n2;
        n2.previous = n1;


        n2.next = n3;
        n3.previous = n2;

        // printLL(head);
        head = insertLL(3, 9, head);
        // head = deleteLL(0, head);
        printLL(head);
    }
    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
    public static Node<Integer> insertLL(int pos, int data, Node<Integer> head){
        Node<Integer> newNode = new Node(data);
        if(pos == 0){
            newNode.next = head;
            head.previous = newNode;
            return newNode;
        }

        Node<Integer> temp = head;
        for(int i = 0; i < pos - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.previous = newNode;

        temp.next = newNode;
        newNode.previous = temp;

        return head;
    }

    public static Node<Integer> deleteLL(int pos, Node<Integer> head){
        if(pos == 0){
            head = head.next;
            return head;
        }
        Node<Integer> prev = head;
        for(int i = 0; i < pos - 1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return head;
    }
}