public class cycleDetect {

    public static class Node{
        int data;
        Node next;

            Node(int data){
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
    public static boolean  checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node slow = head;
        Node fast = head;

        //Find middle element
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
          

        //Reverse second half;
        Node temp  ;
        Node prev = null;
        Node cur = slow;
        while(cur!=null){
            temp = cur.next;
            cur.next = prev  ;
            prev = cur;
            cur = temp;
        }

        Node left = head;
        Node right = prev;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void printList(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean  detectCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
    return false;
    }
    public static void main(String args[]){
         
        // addFirst(1);
        // addFirst(2);
        // addFirst(3);
        // addFirst(2);
        // addFirst(1);

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next =  new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        //head.next.next.next.next.next.next.next = head.next.next;

        System.out.println("cycle detect"+" "+detectCycle(head));
        // System.out.println(checkPalindrome());
    }
}
