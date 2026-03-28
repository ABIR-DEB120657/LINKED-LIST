class Node10 {
    int data;
    Node10 next;
    Node10(int data) {
        this.data = data;
        this.next = null;
    }
}
    class LinkedList10{
        Node10 head;
        Node10 tail;
        int size;
        LinkedList10(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        void addAthead10(int vall) {
            Node10 temp = new Node10(vall);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void addAttail10(int vall) {
            if (tail == null) {
                addAthead10(vall);  // this is work correctly but dangerious
                return;
            }
            Node10 temp = new Node10(vall);
            //or use it
            // if(tail == null) {
            // tail = head = temp;
        //}else{
            tail.next = temp;
            tail = temp;
            //}
            size++;
        }
        void deletehead10(){
            if(head ==null){
                System.out.println("list empty");
                return;
            }
            head = head.next;
            if(head==null){
                tail=null;
            }
            size--;
        }
        boolean search(int vall){
            if(head==null) return false;
            Node10 temp = head;
            while (temp!=null){
                if(vall == temp.data) return true;
                temp = temp.next;
            }
            return false;
        }
        void display10(){
            if(head ==null) return;
            Node10 temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
public class NodeOfLinkedList10 {
    public static void main(String[] args) {
        LinkedList10 a = new LinkedList10();
        a.addAthead10(10);
        a.addAttail10(10);
        a.addAthead10(20);
        a.addAttail10(20);
        a.addAthead10(30);
        a.addAttail10(30);
        a.display10();
        System.out.println("linked list size : "+a.size);
        System.out.println("search 10 "+a.search(10));
        System.out.println("search 20 "+a.search(20));
        System.out.println("search 30 "+a.search(30));
        System.out.println("search 10 "+a.search(40));
    }
}
