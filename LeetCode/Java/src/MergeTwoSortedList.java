import models.ListNode;

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.getVal() < list2.getVal()) {
                list1.setNext(mergeTwoLists(list1.getNext(), list2));
                return list1;
            } else
                list2.setNext(mergeTwoLists(list1, list2.getNext()));
            return list2;
        }
        if (list1 == null)
            return list2;
        else return list1;
    }

    static void afficher(ListNode l) {
        if (l != null) {
            System.out.println(l.getVal());
            afficher(l.getNext());
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = mergeTwoLists(l1,l2);
        afficher(l3);
    }
}
