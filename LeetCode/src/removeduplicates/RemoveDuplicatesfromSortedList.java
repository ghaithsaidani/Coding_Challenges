package removeduplicates;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null)
            return null;
        ListNode result= new ListNode(head.val);
        ListNode copy=result;
        while(head!=null){
            if(copy.val!=head.val){
                copy.next= new ListNode(head.val);
                copy=copy.next;
            }
            head=head.next;
        }
        return result;
    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        ListNode deleted=deleteDuplicates(list);
        while (deleted!=null){
            System.out.println(deleted.val);
            deleted=deleted.next;
        }
    }
}
