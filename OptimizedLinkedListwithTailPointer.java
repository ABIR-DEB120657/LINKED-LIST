class node{//user defined data type
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next= null;
    }
}
class Linkedlist{//user defined data structure
    node head; // null
    node tail; //null
    Linkedlist(){
        this.head = null;
        this.tail = null;
        head=tail=null;
    }
    void addAttail(int value) {
        node temp = new node(value);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    void addAthead(int value) {
        node temp = new node(value);
        if (head == null) {
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }
    void display(){
        if (head == null) return;
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
}
public class NodeOfLinkedList8 {
    public static void main(String[] args) {
        Linkedlist a = new Linkedlist();
        a.addAttail(10); a.display();
        a.addAttail(20); a.display();
        a.addAttail(30); a.display();
        a.addAttail(40); a.display();
        a.addAttail(50); a.display();
        a.addAthead(60); a.display();
        a.addAthead(70); a.display();
        a.addAthead(80); a.display();
    }
}
