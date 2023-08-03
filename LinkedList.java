public class LinkedList{
public static class Node{
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    }
 }
 public static Node head;
  public static Node tail;
  public static int size;


 public static void insertbegin(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        size++;
        return;
    }

    newNode.link = head;
    head = newNode;

    printList(head);
    
    
 }

 public static void  insertLast(int data){

    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
    }
    tail.link = newNode;
    tail = newNode;

    printList(head);

 }

 public static void printList(Node head){
    Node temp = head;
    if(head == null){
          System.out.println("Linked List is Empty");
          return  ;
    }
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp = temp.link;
    }
    System.out.println("null");
 }

 public static void insertMiddle(int data, int pos){
    
   if(pos == 0){
    insertbegin(data);
    return;
   }
    Node newNode = new Node(data);
    size++;
    Node cur = head;
    int i=0;
    while(i<pos-1){
        cur = cur.link;
        i++;
    }
   newNode.link = cur.link;
   cur.link = newNode ;
            
            
    printList(head);
 }

 public static void reverse(){
    if(head == null){
        System.out.println("LinkedList is empty");
        return;
    }
    Node prev = null;
    Node cur = head;

    while(cur!=null){
        Node temp = cur.link ; 
        cur.link = prev;
        prev = cur;
        cur = temp;

    }
    printList(prev);
 }

//  public static void removeFirst(){
//     if(head == null){
//         System.out.println("LinkedList is empty");
//         return;
//     }
//     Node temp = head;
//     head = temp.link;
//     temp.link = null;
//     printList(head);
//  }

public static void removeFirst(){
    if(head == null){
      System.out.println("LinkedList is empty");
      return;
    }
    Node temp = head;
    head = temp.link;
    temp.link = null;
    size--;
    System.out.println(head.data);
  }


    public static void main(String args[]){
        insertbegin(1) ;
        insertbegin(2) ;      
        insertbegin(3) ;
        

        insertLast(4);
        insertMiddle(5,-4);

        reverse();
        removeFirst();
        printList(head);
    }
}