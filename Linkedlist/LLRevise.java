import java.util.Scanner;

class Node<G>{
    G val;
    Node<G> next;
    Node<G> prev;

    public Node(G val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
public class LLRevise {
    public static Node<Integer> takeInputNode(){
        Node<Integer> head = null;
        Node<Integer> tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
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
            // head.prev = newNode;
            return newNode;
        }
        Node<Integer> temp = head;
        for(int i = 0; i < pos - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        // temp.prev = newNode;


        temp.next = newNode;
        // newNode.prev = temp;

        return head;
    }
    public static Node<Integer> delelteLL(Node<Integer> head, int pos){
        if(pos == 0){
            head = head.next;
            return head;
        }
        Node<Integer> temp = head;
        for(int i = 0; i < pos - 1; i++){
            temp.next = temp.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> newNode = takeInputNode();
        newNode = insertLL(3, 4, newNode);
        printLL(newNode);
        newNode = delelteLL(newNode, 0);
        printLL(newNode);
    }
}
