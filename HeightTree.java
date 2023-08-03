public class HeightTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //public static Node head;

    public static int Height(Node head){
        if(head == null){
            return 0;
        }
        
        int left = Height(head.left);
        int right = Height(head.right);
         
        return Math.max(left,right)+1;
    }

    public static int Diameter(Node head){
        if(head == null){
            return 0;
        }
        int left = Height(head.left);
        int right = Height(head.right);

        int selfDiam = left+right+1;

        int ldiam = Diameter(head.left);
        int rdiam = Diameter(head.right);

        return  Math.max(selfDiam, Math.max(ldiam, rdiam));

    }
    
     public static void main(String[] args) {

        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.left.left.left = new Node(8);

              System.out.println(Height(head)) ;
              System.out.println(Diameter(head)) ;
     }    
}
