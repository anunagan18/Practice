package problems;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists){
		if(lists == null || lists.length == 0) return null;
		
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
			public int compare(ListNode o1,ListNode o2){
				if(o1.val<o2.val){
					return -1;
				}else if(o1.val == o2.val){
					return 0;
				}else{
					return 1;
				}
			}
		});
		
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		for(int i=0;i<lists.length;i++){
	        if(lists[i] != null){
			pq.add(lists[i]);
	        }
			
	}
	    while(!pq.isEmpty()){
	            tail.next = pq.poll();
	            tail = tail.next;
	            if(tail.next!=null){
	                pq.add(tail.next);
	            }
		}
		return dummy.next;
	 
	}
	
	public static void  main(String args[]){
		MergeKSortedLists m = new MergeKSortedLists();
		ListNode[] l = new ListNode[3];
		l[0] = new ListNode(1);
		l[0].next = new ListNode(3);
		l[0].next.next = new ListNode(5);
		l[0].next.next.next = new ListNode(7);
		
		l[1] = new ListNode(2);
		l[1].next = new ListNode(4);
		l[1].next.next = new ListNode(6);
		l[1].next.next.next = new ListNode(8);
		
		l[2] = new ListNode(0);
		l[2].next = new ListNode(9);
		l[2].next.next = new ListNode(10);
		l[2].next.next.next = new ListNode(11);
		
		ListNode result = m.mergeKLists(l);
		
		while(result !=null){
			System.out.print("\t"+ result.val);
			result = result.next;
		}
	}
		
	}

