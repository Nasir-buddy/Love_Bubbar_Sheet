import java.util.Scanner;

class Node<G>{
    // G = Generic 
    G data;
    Node<G> next;
    Node<G> prev;

    public Node(G data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class PalindromeLL {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Linked List data : ");
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
        sc.close();
        return head;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static boolean isPalindrome(Node<Integer> head){
        Node<Integer> list1 = head;
        Node<Integer> middle = findMiddle(head);
        Node<Integer> list2 = reverse(middle);

        while(list2 != null){
            if(list1.data != list2.data){
                return false;
            } else {
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        return true;
    }

    public static Node<Integer> findMiddle(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while(curr != null){
            Node<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node<Integer> newNode = takeInput();
        System.out.println(isPalindrome(newNode));
    }
}
