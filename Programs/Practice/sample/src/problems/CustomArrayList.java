package problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomArrayList<T> implements Iterable<T>{
	private List<T> myList = new ArrayList<>();

	public void add(T val){
		myList.add(val);
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new CustomIterator(myList);
	}
	
	public class CustomIterator<E> implements Iterator<E>{
		
		int indexPos = 0;
		List<E> listIterator;

		public CustomIterator(List<E> listIterator){
			this.listIterator = listIterator;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(listIterator.size() >= indexPos +1){
				return true;
			}
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E val = listIterator.get(indexPos);
			indexPos++;
			
			return val;
		}
		
	}

}
