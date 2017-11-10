package problems;

public class Fibonacci {

	public static  int  calcFib(int n){
		if(n<=1) return n;
		else return calcFib(n-1) + calcFib(n-2);
	}
	
	public static int iterativeFib(int n){
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	
	public static void main(String[] args){
		
		int n = 7;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + calcFib(i));
		
        System.out.println("number =" +iterativeFib(8));
	}
	
	
}
