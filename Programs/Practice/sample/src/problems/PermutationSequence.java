package problems;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

	public String getPermuntaion(int n, int k){
		int t=1;
		List<Integer> numbers= new ArrayList<>(n);
		for(int i=1;i<=n;i++){
			t = t*i;
			numbers.add(i);
		}
		t /=n;
		k--;
		StringBuilder sb = new StringBuilder();
		 for (int i = n - 1; i >= 1; i--) {
	            int p = k / t;
	            int np = numbers.get(p);
	            sb.append(String.valueOf(np));
	            numbers.remove(p);
	            k %= t;
	            t /= i;
	        }
	        sb.append(String.valueOf(numbers.get(0)));
	        return sb.toString();
	}
	
	public static void main(String[] args){
		
		PermutationSequence p = new PermutationSequence();
		String result = p.getPermuntaion(4, 2);
		
		System.out.println("Result ="+ result);
	}
}
