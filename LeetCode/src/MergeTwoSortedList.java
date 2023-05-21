
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

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else
                list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        if (list1 == null)
            return list2;
        else return list1;

    }

    static void afficher(ListNode l) {
        if (l != null) {
            System.out.println(l.val);
            afficher(l.next);
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = mergeTwoLists(l1,l2);
        afficher(l3);
    }
}
