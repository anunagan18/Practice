package problems;

import java.util.HashMap;

public class MaxSubArrayLen {

	
	public static int maxSubArrayLen(int[] nums, int k){
		int sum=0;
		int max =0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			sum = sum+nums[i];
			if(sum == k)
					max = i+1;
			else if(map.containsKey(sum-k)){
				max= Math.max(max, i-map.get(sum-k));
			}
			
			if(!map.containsKey(sum)){
				map.put(sum, i);
			}
			
		}
		return max;
	}
	
	public static void main(String[] args){
		int nums[] = {-2, -1, 2, 1};
		int k=1;
		int result = MaxSubArrayLen.maxSubArrayLen(nums, k);
		System.out.println("Result=" +result);
	}
}
