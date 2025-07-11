public class Solution21 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode merge = null;
    if (list1 == null && list2 == null) {
      return merge;
    } else if (list1 == null) {
      return list2;
    } else if (list2 == null) {
      return list1;
    } else {
      if (list1.val < list2.val) {
        merge = new ListNode(list1.val);
      } else {
        merge = new ListNode(list2.val);
      }
      ListNode tempMerge = merge;
      ListNode tempList1 = list1;
      ListNode tempList2 = list2;

      while (tempList1 != null && tempList2 != null) {
        if (tempList1.val < tempList2.val) {
          tempMerge.next = new ListNode(tempList2.val);
        } else {
          tempMerge.next = new ListNode(tempList1.val);
        }

        tempMerge = tempMerge.next;
        tempList1 = tempList1.next;
        tempList2 = tempList2.next;
        if (tempList1 != null) {
          if (tempList1.val < tempList2.val) {
            tempMerge.next = new ListNode(tempList1.val);
          } else {
            tempMerge.next = new ListNode(tempList2.val);
          }
        }
        tempMerge = tempMerge.next;
      }

      return merge;
    }

  }
}
