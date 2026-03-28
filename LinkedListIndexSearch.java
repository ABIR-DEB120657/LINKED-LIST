class Node7{
    int data;
    Node7 next;
    //constructor
    Node7(int data){
        this.data = data;
        this.next = null ;
    }
    int displayindex(Node7 head,int idx){
        for(int i = 0;i<idx;i++){
            head = head.next;
        }
        return head.data;
    }
}
public class NodeOfLinkedList7 {
    public static int display(Node7 head,int index){
        Node7 temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        Node7 a = new Node7(1);
        Node7 b = new Node7(2);
        Node7 i = new Node7(3);
        Node7 r = new Node7(4);
        a.next = b;
        b.next = i;
        i.next = r;
        r.next = null;
        System.out.println(display(a,3));
        System.out.println(a.displayindex(a,3));

    }
}
