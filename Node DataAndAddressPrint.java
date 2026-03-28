class Node1{
    int data;
    Node1 next;
    // use constractor
    Node1(int data){
        this.data = data ;
        this.next = null;
    }
}
public class NodeOfLinkedList2 {
    public static void main(String[] args) {
        Node1 a = new Node1(1); // head node
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        //connecting pointer
        a.next = b ;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println("a address = "+a);
        System.out.println(a.next);
        System.out.println("b address = "+b);
        System.out.println(b.next);
        System.out.println("c address = "+c);
        System.out.println(c.next);
        System.out.println("d address = "+d);
        System.out.println(d.next);
        System.out.println("e address = "+e);
        System.out.println(e.next);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.next.data);




    }
}
