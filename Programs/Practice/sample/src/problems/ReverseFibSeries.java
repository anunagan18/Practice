package problems;

public class ReverseFibSeries {

	
	public static void reverseFibSeries(int n){
		int a[] = new int[n];
		a[0] =1;
		a[1] =1;
		
		for(int i=2;i<n;i++){
			a[i] =a[i-2] +a[i-1];
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");

		}
		System.out.println("Reverse");

		for(int i =n-1;i>=0;i--){

			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String args[]){
		int n=5;
		reverseFibSeries(n);
	}
}
