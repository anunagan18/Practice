package problems;

public class Factorial {

	
	public int fact(int n){
		int product =1;
		for(int i=1;i<=n;i++){
			product *=i;
		}
		return product;
	}
	
	public int recFact (int n){
		if(n<=1)return 1;
		
		else return n*recFact(n-1);
	}
	
	public static void main(String args[]){
		Factorial f = new Factorial();
		int result = f.recFact(5);
		System.out.println("Recursion result =" +result);
		
		int iterResult = f.fact(7);
		System.out.println("Iterative result =" +iterResult);
	}
}
