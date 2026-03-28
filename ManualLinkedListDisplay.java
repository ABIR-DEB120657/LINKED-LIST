class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

public class NodeOfLinkedList3 {
    public static void display(Node3 head){
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
        System.out.println(head.next.next.next.next.next.data);
    }
    public static void main(String[] args) {
        Node3 a = new Node3(1);
        Node3 b = new Node3(2);
        Node3 c = new Node3(3);
        Node3 d = new Node3(4);
        Node3 e = new Node3(5);
        Node3 f = new Node3(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        display(a);
    }
}
