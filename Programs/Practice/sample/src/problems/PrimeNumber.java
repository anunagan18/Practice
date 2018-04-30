package problems;

public class PrimeNumber {

	public boolean isPrime(int n){
		for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public boolean isPrime2(int n){
		for(int i=2;2*i<n;i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args){
		PrimeNumber p  = new PrimeNumber();
		boolean result = p.isPrime(101);
		System.out.print("Result = "+result);
	}
}
