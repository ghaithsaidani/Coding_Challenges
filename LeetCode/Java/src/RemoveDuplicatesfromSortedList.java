import models.ListNode;

public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null)
            return null;
        ListNode result= new ListNode(head.getVal());
        ListNode copy=result;
        while(head!=null){
            if(copy.getVal()!=head.getVal()){
                copy.setNext(new ListNode(head.getVal()));
                copy=copy.getNext();
            }
            head=head.getNext();
        }
        return result;
    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        ListNode deleted=deleteDuplicates(list);
        while (deleted!=null){
            System.out.println(deleted.getVal());
            deleted=deleted.getNext();
        }
    }
}
