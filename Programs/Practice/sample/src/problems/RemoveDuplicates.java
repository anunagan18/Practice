package problems;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		   int i = 0;
		   for (int n : nums)
		      if (i < 2 || n > nums[i - 2])
		         nums[i++] = n;
		   return i;
		}
	
	
	public static void main(String[] args){
		RemoveDuplicates r = new RemoveDuplicates();
		int nums[] = {1,1,1,2,2,3};
		int result =r.removeDuplicates(nums);
		System.out.println("Result =" +result);
		
	}
}
