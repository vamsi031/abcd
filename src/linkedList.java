public class linkedList {
    static linkedList head;
    static linkedList tail;

    int val;
    linkedList next;
    linkedList(int val){
        this.val=val;
    }

    public static void addFirst(int val){//--------------------------------------------
       if(head==null){
           head=new linkedList(val);
       }else{
           linkedList nn = new linkedList(val);
           nn.next=head;
           head=nn;
       }
    }

    public static void addLast(int val){//---------------------------------------------
        if(head==null){
            head=new linkedList(val);
            tail=head;
        }else{
            tail.next=new linkedList(val);
            tail=tail.next;
        }
    }

    public static void findMidd(linkedList head){
        linkedList fast=head;
        linkedList slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
    }

    public static void reverse(linkedList head){
        linkedList prev=null;
        linkedList cur=head;
        while(cur!=null){
            linkedList next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        print(prev);
    }

    public static void print(linkedList head){
        linkedList cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public static void delete(int val){
        if(val== head.val)head=head.next;
        linkedList cur=head;
        linkedList prev=null;
        while(cur!=null){
            if(cur.val==val){
//                prev.next=null;
                prev.next=cur.next;
                break;
            }
            prev=cur;
            cur=cur.next;
        }
    }
    public static void main(String[] args) {//=======================================================
        int arr[] = {1,2,3,4,5,6,7,8,9};

        //arrray to linkedlist
        for(int i=0;i<arr.length;i++){
            addLast(arr[i]);
        }
        delete(2);
        print(head);
//        findMidd(head);
//        reverse(head);
    }
}
