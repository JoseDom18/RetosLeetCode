public class Escenario21 {
  public static void main(String[] args) {

    // Lista de nodos 1
    
    ListNode x = new ListNode(1);
    ListNode y = new ListNode(2);
    ListNode z = new ListNode(4);

    x.next = y;
    y.next = z;

    ListNode list1 = x;

    // Lista de nodos 2

    ListNode a = new ListNode(1);
    ListNode b = new ListNode(3);
    ListNode c = new ListNode(4);

    a.next = b;
    b.next = c;

    ListNode list2 = a;

    ListNode merge = null;

    while (list1 != null && list2 != null) {
      System.out.println(list1.val);
      System.out.println(list2.val);
      merge = list1.next;
      list2 = list2.next;
    }
  }
}
