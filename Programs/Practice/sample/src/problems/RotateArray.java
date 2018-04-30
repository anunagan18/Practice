package problems;

public class RotateArray {
public int[] rotate(int[] nums, int k){
	
	reverse(nums,0, nums.length-1);
	reverse(nums,0, k-1);
	reverse(nums,k, nums.length-1);
	
	return nums;
}

public void reverse(int[] nums, int i, int j){
	while(i<j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		i++;
		j--;
	}
	
}

public static void main(String[] args){
	RotateArray r = new RotateArray();
	int nums[] = {1,2,3,4,5,6,7};
	int k = 3;
	int[] result = r.rotate(nums, k);
	
	for(int num:result){
		System.out.print("Rotated Array = " + num);
	}
}
}
