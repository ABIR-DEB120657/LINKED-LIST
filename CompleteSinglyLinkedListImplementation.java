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
//        boolean search(int vall){
//            if(head==null) return false;
//            Node10 temp = head;
//            while (temp!=null){
//                if(vall == temp.data) return true;
//                temp = temp.next;
//            }
//            return false;
//        }
        int search(int vall){
            if(head == null ) return -1;
            Node10 temp = head;
            int index = 0;
            while (temp != null){
                if(vall == temp.data) return index;
                temp = temp.next;
                index++;
                }
            return -1;
        }
        void insert(int vall,int index){
            if(index<0 || index>size){
                System.out.println("invalid index");
            }
            else if(index==0) addAthead10(vall);
            else if(index==size) addAttail10(vall);
            else{
                Node10 temp = head;
                for(int i=0;i<index-1;i++){
                    temp = temp.next;
                }
                Node10 d = new Node10(vall);
                d.next = temp.next;
                temp.next = d;
                size++;
            }
        }
        int get(int index){
            Node10 temp = head;
            for(int i = 0;i<index;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAtnode(int index){
            if(index<0 || index>=size){
                System.out.println("invalid index");
                return;
            }
            Node10 temp = head;
            for(int i = 0;i<index-1;i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index==size-1) tail = temp;
            size--;

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
        System.out.println("-1 means element not exit");
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
        a.insert(60,2);  a.display10();
        System.out.println("lined list size : "+a.size);
        System.out.println("check element use index = "+a.get(3));
        System.out.println(" delete 4 th index ");
        a.deleteAtnode(4);  a.display10();
    }
}
