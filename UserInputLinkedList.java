import java.util.Scanner;
class Node5{
    int data;
    Node5 next ;
    Node5(int data){
        this.data = data;
        this.next = null;
    }
    void display(Node5 head){
        Node5 temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class NodeOfLinkedList5 {
    public static void main (String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("enter a number NUmber 1 = ");
        int x = ab.nextInt();
        Node5 a = new Node5(x);
        System.out.println(" ");
        System.out.print("enter a number NUmber 2 = ");
        Node5 b = new Node5(ab.nextInt());
        System.out.println(" ");
        System.out.print("enter a number NUmber 3= ");
        Node5 c = new Node5(ab.nextInt());
        System.out.println(" ");
        System.out.print("enter a number NUmber 4 = ");
        Node5 d = new Node5(ab.nextInt());
        System.out.println(" ");
        System.out.print("enter a number NUmber 5 = ");
        Node5 e = new Node5(ab.nextInt());
        System.out.println(" ");
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next = null;
        a.display(a);

    }
}
