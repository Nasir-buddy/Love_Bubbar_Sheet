package Stack;

public class stackusingArray {
    private int data[];
    private int top;

    public void stackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public stackusingArray(int x) {
        data = new int[x];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFUll() {
        return top == size() - 1;
    }

    int size() {
        return (top + 1);
    }

    public int top() {
        if (top == data.length) {
            System.out.println("Stack is Full.");
        }
        System.out.print("Top element is : " + data[top]);
        return data[top];
    }
    public void push(int elem){
        if(size() == data.length){
            System.out.println("stack is full now.");
        } else {
            top++;
            data[top] = elem;
            System.out.println("element pushed.");
        }
    }
    public int pop(){
        if(size() == -1){
            return -1;
        } else {
            int temp = data[top];
            top--;
            return temp;
        }
    }
}
