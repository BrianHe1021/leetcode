package question2_Add_Two_Number.java;
import java.util.ArrayList;
import java.util.List;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode(int x) { val = x; };
  public static ListNode constructLinkedList(int[] num1){
	  
	  ListNode head = new ListNode(num1[0]);
	  ListNode list = head;
	  for(int i = 1; i<num1.length; i++) {
		  head.next = new ListNode(num1[i]);
		  head = head.next;
	  }
	  return list;
  };
  public List<Integer> tolist(){
	  ListNode current = this;
	  List<Integer> list = new ArrayList<Integer>();
	  while(current != null) {
		  list.add(current.val);
		  current = current.next;
	  }
	  return list;
  }
}
