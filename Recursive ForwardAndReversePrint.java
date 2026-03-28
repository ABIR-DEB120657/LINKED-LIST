import java.util.Scanner;
class Node6{
    int data ;
    Node6 next;
    //constructor
    Node6(int data){
        this.data = data;
        this.next = null;
    }
    void displayrecursion(Node6 head){
        Node6 temp = head;
        if(temp==null) return ;// ata base case
        System.out.print(head.data+" ");
        displayrecursion(head.next);

    }
}
public class NodeOfLinkedList6 {
    public static void DisplayRecursion(Node6 head){
        if(head == null) return ; //base case
        DisplayRecursion(head.next);
        System.out.print(head.data+" "); // reverse print
    }
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter the number of nodes = ");
        Node6 a = new Node6(ab.nextInt()); //create object (ata head node)
        System.out.println(" ");
        System.out.print("Enter the number of nodes = ");
        Node6 b = new Node6(ab.nextInt());
        System.out.println(" ");
        System.out.print("Enter the number of nodes = ");
        Node6 i = new Node6(ab.nextInt());
        System.out.println(" ");
        System.out.print("Enter the number of nodes = ");
        Node6 r = new Node6(ab.nextInt()); // ata tail node
        a.next = b;
        b.next = i;
        i.next = r;
        r.next = null;
        a.displayrecursion(a);
        System.out.println(" ");
        System.out.print("reverse print use recursion : ");
        DisplayRecursion(a);
    }
}
