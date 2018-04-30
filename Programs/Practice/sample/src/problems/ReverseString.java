package problems;

public class ReverseString {

	public static String reverseString(String str){
		
		StringBuilder sb = new StringBuilder();
		
		String arr[] = str.split(" ");
		
		for(int i =arr.length-1;i>=0;--i){
			if(!arr[i].equals(""))
			sb.append(arr[i]).append(" ");
		}
	return sb.length() == 0?"" :sb.substring(0,sb.length()-1);	
	}
	
	
	
	public static void main(String args[]){
		ReverseString r = new ReverseString();
		String reverseString = r.reverseString("a");
		
		System.out.println("r =" + reverseString);
		}
}
