package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SampleIterator {
	private int pointer = 0;
	
	public void printSorted(Iterator<Integer> it1, Iterator<Integer> it2){
		Integer first = null;
		Integer second = null;
		if(it1.hasNext()) {
			first = (Integer) it1.next();
		}
		if(it2.hasNext()) {
			second = it2.next();
		}
		
		while(first != null && second != null) {
			if(first-second<0) {
				System.out.println(first);
				first = null;
				if(it1.hasNext()) {
					first = it1.next();
				}
				else if (second != null) {
					System.out.println(second);
					second = it2.next();
					//second = null;
				}
			} else if(second-first<0) {
				System.out.println(second);
				second = null;
				if(it2.hasNext()) {
					second = it2.next();
				}
				else if(first != null) {
					System.out.println(first);
					first = it1.next();
				}
			} else {
				System.out.print(first);
				System.out.print(second);
				first = null;
				second = null;
				if(it1.hasNext()) {
					first = it1.next();
				}
				if(it2.hasNext()) {
					second = it2.next();
				}
			}
		}
	}
	
	public static void main(String[] args){
		SampleIterator s = new SampleIterator();
		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(11);
		l1.add(19);

		Iterator<Integer> i1 = l1.iterator();
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(2);
		l2.add(4);
		l2.add(30);
		l2.add(45);

		Collections.sort(l2);
		//2,4,5,11,19,30
		Iterator<Integer> i2 = l2.iterator();

		s.printSorted(i1, i2);
		
	}
}
