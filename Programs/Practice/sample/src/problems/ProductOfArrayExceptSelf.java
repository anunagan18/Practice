package problems;

public class ProductOfArrayExceptSelf {
	public int[] productArray(int[] n){
		int[] res = new int[n.length];
		int left = 1;
		int right =1;
		
		for(int i=0;i<n.length;i++){
			if(i > 0)
				left = left* n[i-1];
				res[i] = left;
			
		}
		
		for(int j=n.length-1;j>=0;j--){
			if(j<n.length-1)
				right = right*n[j+1];
				res[j] *=right;
			
		}
		return res;
	}
	
	public static void main(String[] args){
		ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
		int[] n ={1,2,3,4};
		int[] res = p.productArray(n);
		for(int i=0;i<res.length;i++){
			System.out.print("\t" +res[i]);
		}
	}
}
