class Node9{
    int data;
    Node9 next;
    Node9(int data){
        this.data= data;
        this.next = null;
    }
}
class Linkedlist1{
    Node9 head;
    Node9 tail;
    int size;
    Linkedlist1() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    void addAttail1(int value) {
        Node9 temp = new Node9(value);
        //if(tail==null) head = tail = temp;
        if (head == null){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAthead1(int value){
        Node9 temp = new Node9(value);
        //if(tail== null) head = tail= temp;
        if(head== null) {
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deletehead(){
        if(head == null){
            System.out.println("list empty");
            return;
        }
            head = head.next;
        if(head == null) tail = null;
        size--;
    }
    void display1(){
        if(head == null) return;
        Node9 temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    }
public class NodeOfLinkedList9 {
    public static void main(String[] args) {
        Linkedlist1 a =  new Linkedlist1();
        a.addAttail1(10);
        a.addAttail1(20);
        a.addAttail1(30);
        a.addAttail1(40);
        a.addAthead1(10);
        a.addAthead1(20);
        a.addAthead1(30);
        a.addAthead1(40);
        a.display1();
        System.out.println("the size is = "+a.size);
        System.out.println("one one add head and tail");
        a.addAttail1(10); a.display1();
        a.addAttail1(20); a.display1();
        a.addAttail1(30); a.display1();
        a.addAttail1(40); a.display1();
        a.addAthead1(10); a.display1();
        a.addAthead1(20); a.display1();
        a.addAthead1(30); a.display1();
        a.addAthead1(40); a.display1();
        a.deletehead(); a.display1();
        a.deletehead(); a.display1();
        a.deletehead(); a.display1();
        a.deletehead(); a.display1();
        a.deletehead(); a.display1();
        a.deletehead(); a.display1();
        a.deletehead(); a.display1();





    }
}
