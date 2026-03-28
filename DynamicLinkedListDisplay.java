class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
        this.next=null;

    }
}
public class NodeOfLinkedList4 {
    public static void display (Node4 head ) {
//        while (head.next != null){
//            System.out.println(head.data);
//            head = head.next;
//        }
//        Node4 temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        for(Node4 temp = head;temp!=null;temp= temp.next) {
            System.out.print(temp.data+" ");
        }

    }
    public static void main(String[] args) {
    Node4 a = new Node4 (1);
    Node4 b = new Node4 (2);
    Node4 c = new Node4 (3);
    Node4 d = new Node4 (4);
    Node4 e = new Node4 (5);
    Node4 f = new Node4 (6);
    Node4 g = new Node4 (7);
    Node4 h = new Node4 (8);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    g.next = h;
    display(a);

    }
}
