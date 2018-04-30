package problems;

public class PalindromeRecursion {

	public static boolean isPalindrome(String str, int s, int e){
		if(s == e)return true;
		
		if(str.charAt(s) != str.charAt(e)) return false;
		
		if(s<e+1){
			return isPalindrome(str,s+1, e-1);
		}
		
		return true;
	}
	
	public static boolean isPal(String s){
		int n = s.length();
		if(n==0)return true;
		return isPalindrome(s,0,n-1);
		
	}
	
	 public static void main(String args[])
	    {
	        String str = "geeg";
	 
	        if (isPal(str))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
}
