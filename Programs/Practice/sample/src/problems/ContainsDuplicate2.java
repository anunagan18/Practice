package problems;

import java.util.HashMap;
import java.util.HashSet;

//Given an array of integers and an integer k, find out whether there are 
//two distinct indices i and j in the array such that nums[i] = nums[j] and 
//the absolute difference between i and j is at most k.


public class ContainsDuplicate2 {

	public boolean containsDuplicate(int[] nums,int k){
	HashSet<Integer> set = new HashSet<>();
	
	for(int i=0;i<nums.length;i++){
		if(set.contains(nums[i])){
			return true;
		}
		set.add(nums[i]);
		if(i>=k){
			set.remove(nums[i-k]);
		}
	}
		
		
		return false;
	}
	
	
	public boolean containsDuplicateMap(int[] nums,int k){
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
 		for(int i=0;i<nums.length;i++){
 			if(map.containsKey(nums[i])){
 				if(i - map.get(nums[i]) <=k){
 					return true;
 				}
 				map.put(nums[i], i);
 			}
 		}
 		return false;
	}
	
	public static void main(String[] args){
		ContainsDuplicate2 c = new ContainsDuplicate2();
		int[] nums = {1, 2, 1, 4, 1, 2, 3, 4};
		int k = 2;
		boolean result = c.containsDuplicate(nums, k);
		//boolean result = c.containsDuplicateMap(nums, k);
		System.out.println("Result = "+ result);
	}
}
