package problems;

import java.util.Iterator;
import java.util.List;

public class CarShop implements Iterable{

	List<Car> carList;
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return (Iterator<Car>) new CarShopIterator();
	}
	
	
	public class CarShopIterator implements Iterator{
		int currIndex = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(currIndex >= carList.size()){
				return false;
			}else{
			return true;
			}
		}

		@Override
		public Car next() {
			// TODO Auto-generated method stub
			return carList.get(currIndex++);
		}
		
	}

	public static void main(String[] args){
		
	}
}
