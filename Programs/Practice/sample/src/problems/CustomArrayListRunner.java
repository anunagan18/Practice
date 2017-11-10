package problems;

public class CustomArrayListRunner {
	
	public static void main(String[] args){
		CustomArrayList<String> myarray = new CustomArrayList();
		myarray.add("Hello");
		myarray.add("Hello Anu");
		myarray.add("Hello Arjun");
		myarray.add("Hello vivek");
		
		for(String name: myarray){
		System.out.println("HEY *****" + name);	
		}
	}

}
