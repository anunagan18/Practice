package problems;

import java.util.Stack;

public class AddTwoNumberII {

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 
		 Stack<Integer> stk1= new Stack<>();
		 Stack<Integer> stk2 = new Stack<>();
		 
		 while(l1!=null){
			 stk1.push(l1.val);
			 l1=l1.next;
		 }
		 while(l2!=null){
			 stk2.push(l2.val);
			 l2=l2.next;
		 }
		 int sum =0;
		 ListNode list = new ListNode(0);
		 while(!stk1.isEmpty() || !stk2.isEmpty()){
			 if(!stk1.isEmpty()) sum+=stk1.pop();
			 if(!stk2.isEmpty()) sum+=stk2.pop();
			 list.val = sum%10;
			 ListNode head = new ListNode(sum/10);
			 head.next = list;
			 list=head;
			 sum/=10;
		 }
		 
		 return list.val == 0 ? list.next:list;
	 }
	 
	 
	 public static void main(String[] args){
		 ListNode l1 = new ListNode(7);
		 l1.next =  new ListNode(2);
		 l1.next.next = new ListNode(4);
		 l1.next.next.next = new ListNode(3);
		 
		 ListNode l2 = new ListNode(5);
		 l2.next = new ListNode(6);
		 l2.next.next = new ListNode(4);
		 
		 AddTwoNumberII a = new AddTwoNumberII();
		 ListNode result = a.addTwoNumbers(l1, l2);
		 
		 while(result!=null){
			 System.out.print("\t"+ result.val + "-->");
			 result = result.next;
		 }
	 }
}
