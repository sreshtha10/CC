class LinkedList{
    class Node{
        int data;
        Node next;
    }
        Node head;
        public void insert(int data){
            Node p = new Node();
            p.data = data;
            p.next = null;
            if(head == null){
                head = p;
            }
            else{
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = p;
            }
        }
        
        public void print(){
            Node p = head;
            if(head == null){
                System.out.println("List is empty");
            }
            while(p!= null){
                System.out.println(p.data+" ");
                p = p.next;
            }
        }
        public void insertStart(int data){
            Node p = new Node();
            p.data= data;
            p.next = head;
            head = p;
            
        }
        public void shift_last_to_first(){
            Node p = head,tmp = head;
            while(p.next.next != null){
                p = p.next;
            }
            tmp = p.next;
            p.next = null;
            tmp.next= head;
            head = tmp;
            return;
        }
        
}


public class Main{
    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.insertStart(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(2);
        linkedlist.insert(0);
        linkedlist.shift_last_to_first();
        linkedlist.print();
    }
}
