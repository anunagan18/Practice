package problems;

import java.util.HashSet;

public class containsDuplicate {

	public boolean containsDuplicate(int[] nums){
		
		HashSet<Integer> set = new HashSet<>();
		for(int num:nums){
		if(set.contains(num)){
			return true;
		}
		set.add(num);
		}
		return false;

	}
	
	public static void main(String[] args){
		containsDuplicate c = new containsDuplicate();
		int[] nums = {1,2,1};
		boolean result = c.containsDuplicate(nums);
		System.out.println("Result = "+ result);
	}
}
	

