package problems;

public class PalindromeNumber {

	public boolean isPalindromeNumber(int num){
		int result = 0;
		int rev = num;
		
		while(rev>0){
			result = 10*result + rev%10;
			rev = rev/10;
		}
		return result == num;
	}
	
	public static void main(String[] args){
		PalindromeNumber p = new PalindromeNumber();
		boolean result = p.isPalindromeNumber(3443);
		System.out.println("Result = "+result);
	}
}
