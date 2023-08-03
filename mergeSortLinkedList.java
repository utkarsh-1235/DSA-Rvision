public class mergeSortLinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void printList(){
        if(head == null){
                 System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node getmid(Node head){
        if(head == null){
            return head;
        }
            Node cur = head;
            Node prev = head;
            while(cur!=null && cur.next!=null){
                    prev = prev.next;
                    cur = cur.next.next;
            }
            return prev;
    }
    public static Node MergeSort(Node head){
             if(head == null || head.next == null){
                System.out.println("LinkedList is empty");
                return head;
             }
                Node mid = getmid(head);

                Node rightHead = mid.next;
                mid.next = null;
                Node newleft = MergeSort(head);
                Node newright = MergeSort(rightHead);

                return Merge(newleft, newright);
 

             
    }

    private static Node Merge(Node left, Node right){
        Node newNode = new Node(-1);


        Node temp = newNode;

        while(left!=null && right!=null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
                 temp = temp.next;
            }
            else{
                temp.next = right;
                right = right.next;
                 temp = temp.next;
            }
           
        }
        while(left!=null){
           temp.next = left;
           left = left.next;
           temp = temp.next;
        }
        while(right!=null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return newNode.next;
    }
    public static void main(String args[]){
        
        addFirst(4);
        addFirst(5);
        addFirst(1);        
        addFirst(2);
        addFirst(3);
        printList();

        MergeSort(head);
        printList();


 //       MergeSort(head, 0, 2);
             
    }
}