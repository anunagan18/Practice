package problems;

public class MissingNumber {

	public int findMissingNumber(int[] nums){
		int res = nums.length;
		for(int i=0;i<nums.length;i++){
			res ^=i;
			res ^=nums[i];
		}
		return res;
	}
	
	
	public static void main(String[] args){
		MissingNumber m = new MissingNumber();
		int[] nums={3,0,1};
		int result =m.findMissingNumber(nums);
		System.out.println("Result = "+result);
	}
}
