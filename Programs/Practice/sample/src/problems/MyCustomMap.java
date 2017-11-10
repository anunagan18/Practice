package problems;

import java.util.ArrayList;
import java.util.List;

public class MyCustomMap {

	private Object dummy = new Object();
	private List<Container> recordList;
	private Container c;

	class Container{
		Object key;
		Object val;
		
		public void insert(Object k, Object val){
			this.key = k;
			this.val = val;
		}
	}
	
	public MyCustomMap(){
		this.recordList = new ArrayList<Container>();
	}
	public void put (Object k, Object val){
		Container record = new Container();
		c.insert(k,val);
		for(int i=0;i<recordList.size();i++){
			Container c1 = recordList.get(i);
			if(c1.key.equals(k)){
				recordList.remove(i);
				break;
			}
			recordList.add(c);
		}
	}
	
	
	public Object get(Object key){
		for(int i=0;i<recordList.size();i++){
			Container c = recordList.get(i);
			if(c.key.equals(key)){
				return c.val;
			}
			
		}
		
		return null;
	}
	public static void main(String[] args){
		MyCustomMap map = new MyCustomMap();
		
		map.put(3, "Anusha");
	 	Object result = (Object) map.get(3);
	 	System.out.println("Value:" +result.toString());
		
	}
}
